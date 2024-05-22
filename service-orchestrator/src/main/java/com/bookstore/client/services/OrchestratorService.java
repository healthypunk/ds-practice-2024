package com.bookstore.client.services;

import com.bookstore.client.models.OrderRequest;
import com.bookstore.client.models.OrderResponse;
import io.opentelemetry.api.metrics.DoubleHistogram;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.LongUpDownCounter;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrchestratorService {
    private final FraudDetectionService fraudDetectionService;
    private final SuggestionService suggestionService;
    private final TransactionVerificationService transactionVerificationService;
    private final OrderQueueService orderQueueService;
    private final Tracer tracer;
    private final Meter meter;


    private LongCounter orderCounter;
    private LongUpDownCounter orderInProgressCounter;
    private DoubleHistogram orderProcessingTimeHistogram;

    @PostConstruct
    public void init() {
        // Initialize OpenTelemetry metrics
        this.orderCounter = meter.counterBuilder("order_counter")
                .setDescription("Counts total orders processed")
                .setUnit("1")
                .build();

        this.orderInProgressCounter = meter.upDownCounterBuilder("order_in_progress_counter")
                .setDescription("Tracks number of orders in progress")
                .setUnit("1")
                .build();

        this.orderProcessingTimeHistogram = meter.histogramBuilder("order_processing_time_histogram")
                .setDescription("Records order processing times")
                .setUnit("ms")
                .build();
    }

    public OrderResponse process(OrderRequest orderRequest) {
        Span span = tracer.spanBuilder("processOrder").startSpan();
        long startTime = System.currentTimeMillis();
        orderInProgressCounter.add(1); // Increment the upDownCounter at the start of processing

        try {
            orderRequest.setId(UUID.randomUUID().toString());
            log.info("[Order ID: {}]", orderRequest.getId());

            transactionVerificationService.verifyBooks(orderRequest);
            transactionVerificationService.verifyCreditCard(orderRequest);
            fraudDetectionService.detectUserDataFraud(orderRequest);
            transactionVerificationService.verifyCreditCard(orderRequest); // Double verification seems redundant
            fraudDetectionService.detectCreditCardFraud(orderRequest);

            OrderResponse.SuggestedBook suggestedBook = suggestionService.suggestBook(orderRequest);
            String status = orderQueueService.enqueueOrder(orderRequest);

            // Record successful order processing
            orderCounter.add(1);

            return new OrderResponse().setOrderId(orderRequest.getId()).setStatus(status).setSuggestedBooks(List.of(suggestedBook));
        } catch (Exception e) {
            log.error(String.valueOf(e));
            return new OrderResponse().setOrderId(orderRequest.getId()).setStatus("FAILURE");
        } finally {
            long endTime = System.currentTimeMillis();
            orderProcessingTimeHistogram.record(endTime - startTime); // Record the processing time
            orderInProgressCounter.add(-1); // Decrement the upDownCounter at the end of processing
            span.end();
        }
    }
}

