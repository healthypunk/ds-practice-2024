package com.bookstore.client.configs;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporter;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.metrics.SdkMeterProvider;
import io.opentelemetry.sdk.metrics.export.PeriodicMetricReader;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenTelemetryConfig {

    @Bean
    public OpenTelemetry openTelemetry() {
        // Configure the Span Exporter
        OtlpGrpcSpanExporter spanExporter = OtlpGrpcSpanExporter.builder().build();
        BatchSpanProcessor spanProcessor = BatchSpanProcessor.builder(spanExporter).build();
        SdkTracerProvider tracerProvider = SdkTracerProvider.builder()
                .addSpanProcessor(spanProcessor)
                .setResource(Resource.getDefault())
                .build();

        // Configure the Metric Exporter
        OtlpGrpcMetricExporter metricExporter = OtlpGrpcMetricExporter.builder().build();
        PeriodicMetricReader metricReader = PeriodicMetricReader.builder(metricExporter).build();
        SdkMeterProvider meterProvider = SdkMeterProvider.builder()
                .setResource(Resource.getDefault())
                .registerMetricReader(metricReader)
                .build();

        // Set the global OpenTelemetry instance
        OpenTelemetrySdk openTelemetrySdk = OpenTelemetrySdk.builder()
                .setTracerProvider(tracerProvider)
                .setMeterProvider(meterProvider)
                .buildAndRegisterGlobal();

        return openTelemetrySdk;
    }

    @Bean
    public Tracer tracer(OpenTelemetry openTelemetry) {
        return openTelemetry.getTracer("exampleTracer");
    }

    @Bean
    public Meter meter(OpenTelemetry openTelemetry) {
        return openTelemetry.getMeter("exampleMeter");
    }
}
