package com.bookstore;

import com.dspractice.bookstore.commonproto.SuggestionServiceGrpc;
import com.dspractice.bookstore.commonproto.SuggestionServiceOuterClass;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@GrpcService
public class SuggestionService extends SuggestionServiceGrpc.SuggestionServiceImplBase {
    protected static final Logger logger = LogManager.getLogger();

    @Override
    public void suggest(SuggestionServiceOuterClass.SuggestionRequest request, StreamObserver<SuggestionServiceOuterClass.SuggestionResponse> responseObserver) {
        logger.info("Received suggestion request");
        SuggestionServiceOuterClass.SuggestionResponse response = SuggestionServiceOuterClass.SuggestionResponse.newBuilder()
                .setBookName("DS practice book").setAuthor("UT").setBookId("12345").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        logger.info("Sent suggestion response");
    }
}
