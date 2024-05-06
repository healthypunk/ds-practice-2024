package com.bookstore.services;

import com.bookstore.config.ReplicationClientConfig;
import com.bookstore.runners.ReplicationApplicationRunner;
import com.dspractice.bookstore.database.*;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
@RequiredArgsConstructor
public class DataStoreService {

    private final ConcurrentHashMap<String, String> dataStore = new ConcurrentHashMap<>();
    private final List<StreamObserver<String>> observers = new CopyOnWriteArrayList<>();
    private final List<DatabaseReplicationGrpc.DatabaseReplicationBlockingStub> replicaStubs;

    /**
     * Stores or updates a value associated with a key and notifies observers.
     *
     * @param key   The key under which the value is stored.
     * @param value The value to store.
     */
    public void put(String key, String value) {
        dataStore.put(key, value);
        notifyObservers(key, value);
        notifyReplicas(key, value);
    }

    /**
     * Retrieves a value by its key.
     *
     * @param key The key of the value to retrieve.
     * @return The value associated with the key, or null if no value is found.
     */
    public String get(String key) {
        return dataStore.get(key);
    }

    /**
     * Adds an observer that will be notified of any new entries.
     *
     * @param observer The observer to add.
     */
    public void addObserver(StreamObserver<String> observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer.
     *
     * @param observer The observer to remove.
     */
    public void removeObserver(StreamObserver<String> observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all observers about a new or updated key-value pair.
     *
     * @param key   The key that was updated.
     * @param value The value that was put.
     */
    private void notifyObservers(String key, String value) {
        String message = "Updated " + key + " with value: " + value;
        for (StreamObserver<String> observer : observers) {
            observer.onNext(message);
        }
    }

    public void applyUpdates(UpdateSinceResponse updates) {
        for (Entry update : updates.getUpdatesList()) {
            put(update.getKey(), update.getValue());
        }
    }

    public List<Entry> getAllUpdates() {
        return dataStore.entrySet()
                .stream()
                .map(entry -> Entry.newBuilder()
                        .setKey(entry.getKey())
                        .setValue(entry.getValue())
                        .build())
                .toList();
    }

    private void notifyReplicas(String key, String value) {
        if (!ReplicationApplicationRunner.isMaster) {
            return;
        }
        UpdateRequest request = UpdateRequest.newBuilder().setEntry(Entry.newBuilder().setKey(key).setValue(value).build()).build();
        replicaStubs.forEach(stub -> {
            if (!isMasterNode(stub)) {
                try {
                    UpdateResponse response = stub.sendUpdate(request);
                    if (response.getSuccess()) {
                        System.out.println("Update sent successfully to replica: " + true);
                    } else {
                        System.err.println("Failed to send update to replica: " + false);
                    }
                } catch (Exception e) {
                    System.err.println("Error sending update to replica: " + e.getMessage());
                }
            } else {
                System.out.println("Skipped sending update to master node.");
            }
        });
    }

    private boolean isMasterNode(DatabaseReplicationGrpc.DatabaseReplicationBlockingStub stub) {
        QueryMasterResponse response = stub.isMaster(QueryMasterRequest.newBuilder().build());
        return response.getIsMaster();
    }
}
