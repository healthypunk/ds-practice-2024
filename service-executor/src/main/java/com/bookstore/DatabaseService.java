package com.bookstore;

import com.dspractice.bookstore.commonproto.PaymentServiceGrpc;
import com.dspractice.bookstore.database.DatabaseServiceGrpc;
import com.dspractice.bookstore.database.WriteRequest;
import com.dspractice.bookstore.database.WriteResponse;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DatabaseService {

    @GrpcClient("grpc-database-service")
    private DatabaseServiceGrpc.DatabaseServiceBlockingStub databaseServiceBlockingStub;

    public void save(String orderId, String paymentId) {
        WriteRequest writeRequest = WriteRequest.newBuilder().setKey(orderId).setValue(paymentId).build();
        WriteResponse response = databaseServiceBlockingStub.write(writeRequest);
        log.info("Successfully save to database");
    }
}
