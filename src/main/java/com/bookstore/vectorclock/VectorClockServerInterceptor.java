package com.bookstore.vectorclock;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Objects;

@Slf4j
@RequiredArgsConstructor
public class VectorClockServerInterceptor implements ServerInterceptor {

    private final VectorClockService vectorClockService;

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
        // Extract the vector clock from the metadata, if present
        // For simplicity, assume we have a method that can parse and deserialize
        // the vector clock from the headers
        Map<String, Long> clientVectorClock = VectorClockUtils.extractVectorClockFromMetadata(headers);

        // Update the vector clock based on this server's logic
        // For example, increment the timestamp for this server's ID

        vectorClockService.updateVectorClock(clientVectorClock);
        log.info("[Vector clock] {}", vectorClockService.getVectorClock().toString());

        // Modify the response headers or context to include the updated vector clock
        // This might involve serializing the vector clock and adding it to the metadata
        headers.put(VectorClockUtils.VECTOR_CLOCK_METADATA_KEY, Objects.requireNonNull(VectorClockUtils.serializeVectorClock(vectorClockService.getVectorClock())));

        return next.startCall(call, headers);
    }
}
