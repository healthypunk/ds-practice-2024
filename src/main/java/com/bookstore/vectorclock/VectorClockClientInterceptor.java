package com.bookstore.vectorclock;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall;
import io.grpc.ForwardingClientCallListener;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Objects;

@Slf4j
@RequiredArgsConstructor
public class VectorClockClientInterceptor implements ClientInterceptor {

    private final VectorClockService vectorClockService;
    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {
            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                // Attach the local vector clock to the call
                Map<String, Long> localVectorClock = vectorClockService.getVectorClock();
                headers.put(Metadata.Key.of("vc", Metadata.ASCII_STRING_MARSHALLER), Objects.requireNonNull(VectorClockUtils.serializeVectorClock(localVectorClock)));

                super.start(new ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT>(responseListener) {
                    @Override
                    public void onHeaders(Metadata headers) {
                        // Update the local vector clock based on the server's response
                        Map<String, Long> serverVectorClock = VectorClockUtils.extractVectorClockFromMetadata(headers);
                        vectorClockService.updateOnlyVectorClock(serverVectorClock);
                        log.info("[Vector clock] {}", vectorClockService.getVectorClock().toString());

                        super.onHeaders(headers);
                    }
                }, headers);
            }
        };
    }
}
