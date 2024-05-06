package com.bookstore.config;

import com.dspractice.bookstore.database.DatabaseReplicationGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ReplicationClientConfig {
    @Value("replication.host")
    private String host;

    @Value("#{'${replication.nodes}'.split(',')}")
    private List<String> nodes;

    @Bean
    public List<DatabaseReplicationGrpc.DatabaseReplicationBlockingStub> replicationClients() {
        return nodes.stream().map(port -> {
            ManagedChannel channel = ManagedChannelBuilder.forAddress(host, Integer.parseInt(port))
                    .usePlaintext()
                    .build();
            return DatabaseReplicationGrpc.newBlockingStub(channel);
        }).toList();
    }
}
