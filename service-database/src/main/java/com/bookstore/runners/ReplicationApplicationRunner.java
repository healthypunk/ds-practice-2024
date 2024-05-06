package com.bookstore.runners;

import com.bookstore.services.DataStoreService;
import com.bookstore.services.DatabaseReplicationService;
import com.dspractice.bookstore.database.DatabaseReplicationGrpc;
import com.dspractice.bookstore.database.UpdateSinceRequest;
import com.dspractice.bookstore.database.UpdateSinceResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class ReplicationApplicationRunner implements CommandLineRunner {
    public static boolean isMaster;
    private final DatabaseReplicationService replicationService;
    private final DataStoreService dataStoreService;


    @Override
    public void run(String... args) {
        // Determine the node's role at startup
        replicationService.determineRole();

        // Log the role status to the console or logs
        isMaster = replicationService.isMaster();
        if (isMaster) {
            log.info("This node is configured as the MASTER.");
        } else {
            log.info("This node is configured as a REPLICA.");
            requestUpdatesFromMaster("lastKnownVersion");
        }
    }

    private void requestUpdatesFromMaster(String lastKnownVersion) {
        log.info("Requesting updates from MASTER");
        DatabaseReplicationGrpc.DatabaseReplicationBlockingStub masterClient = replicationService.findMaster();

        UpdateSinceRequest request = UpdateSinceRequest.newBuilder()
                .setVersion(lastKnownVersion)
                .build();
        UpdateSinceResponse response = masterClient.requestUpdates(request);
        dataStoreService.applyUpdates(response);
        log.info("All updates from MASTER has been received");
    }


}
