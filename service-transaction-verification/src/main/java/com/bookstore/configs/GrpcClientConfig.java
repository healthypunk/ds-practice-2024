package com.bookstore.configs;

import com.bookstore.vectorclock.VectorClockServerInterceptor;
import com.bookstore.vectorclock.VectorClockService;
import io.grpc.ServerInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcClientConfig {

    private final VectorClockService vectorClockService;

    public GrpcClientConfig(VectorClockService vectorClockService) {
        this.vectorClockService = vectorClockService;
    }

    @Bean
    @GrpcGlobalServerInterceptor
    public ServerInterceptor vectorClockServerInterceptor() {
        return new VectorClockServerInterceptor(vectorClockService);
    }
}