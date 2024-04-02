package com.bookstore.client.configs;

import com.bookstore.vectorclock.VectorClockClientInterceptor;
import com.bookstore.vectorclock.VectorClockService;
import io.grpc.ClientInterceptor;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcClientConfig {
    private final VectorClockService vectorClockService;

    public GrpcClientConfig(@Value("${vectorclock.nodeId}") String nodeId) {
        this.vectorClockService = new VectorClockService(nodeId);
    }

    @Bean
    @GrpcGlobalClientInterceptor
    public ClientInterceptor loggingInterceptor() {
        return new VectorClockClientInterceptor(vectorClockService);
    }
}