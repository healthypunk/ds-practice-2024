package com.bookstore.vectorclock;

import io.grpc.ForwardingServerCall;
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

        Map<String, Long> clientVectorClock = VectorClockUtils.extractVectorClockFromMetadata(headers);
        vectorClockService.updateVectorClock(clientVectorClock);

        ServerCall<ReqT, RespT> serverCall = new ForwardingServerCall.SimpleForwardingServerCall<>(call) {
            @Override
            public void sendHeaders(Metadata responseHeaders) {
                // Serialize the updated vector clock and add it to the response metadata
                log.info("[Vector clock] {}", vectorClockService.getVectorClock().toString());
                responseHeaders.put(VectorClockUtils.VECTOR_CLOCK_METADATA_KEY, Objects.requireNonNull(VectorClockUtils.serializeVectorClock(vectorClockService.getVectorClock())));
                super.sendHeaders(responseHeaders);
            }
        };

        return next.startCall(serverCall, headers);
    }
}
