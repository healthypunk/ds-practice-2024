package com.bookstore.config;

import com.bookstore.services.DatabaseReplicationService;
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
        }
    }
}
