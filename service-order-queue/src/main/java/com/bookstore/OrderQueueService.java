package com.bookstore;

import com.dspractice.bookstore.commonproto.OrderDequeueRequest;
import com.dspractice.bookstore.commonproto.OrderEnqueueRequest;
import com.dspractice.bookstore.commonproto.OrderEnqueueResponse;
import com.dspractice.bookstore.commonproto.OrderQueueServiceGrpc;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import io.opentelemetry.api.metrics.DoubleHistogram;
import io.opentelemetry.api.metrics.LongCounter;
import io.opentelemetry.api.metrics.LongUpDownCounter;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.metrics.ObservableDoubleGauge;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
@RequiredArgsConstructor
public class OrderQueueService extends OrderQueueServiceGrpc.OrderQueueServiceImplBase {

    private final PriorityQueueService priorityQueueService;
    private final Tracer tracer;
    private final Meter meter;

    private LongCounter enqueueCounter;
    private LongUpDownCounter inProgressCounter;
    private DoubleHistogram enqueueLatencyHistogram;
    private ObservableDoubleGauge currentQueueSizeGauge;

    @PostConstruct
    public void init() {
        // Initialize OpenTelemetry metrics
        this.enqueueCounter = meter.counterBuilder("enqueue_counter")
                .setDescription("Counts total orders enqueued")
                .setUnit("1")
                .build();

        this.inProgressCounter = meter.upDownCounterBuilder("in_progress_counter")
                .setDescription("Tracks the number of orders currently being processed")
                .setUnit("1")
                .build();

        this.enqueueLatencyHistogram = meter.histogramBuilder("enqueue_latency_histogram")
                .setDescription("Records latency for enqueuing orders")
                .setUnit("ms")
                .build();

        this.currentQueueSizeGauge = meter.gaugeBuilder("current_queue_size_gauge")
                .setDescription("Number of orders currently in the queue")
                .setUnit("1")
                .buildWithCallback(measurement -> {
                    // Implement callback logic to get current queue size
                    measurement.record(getCurrentQueueSize());
                });
    }

    @Override
    public void enqueueOrder(OrderEnqueueRequest request, StreamObserver<OrderEnqueueResponse> responseObserver) {
        Span span = tracer.spanBuilder("enqueueOrder").startSpan();
        long startTime = System.currentTimeMillis();
        try (Scope scope = span.makeCurrent()) {
            log.info("[Order ID: {}] {}", request.getId(), "Waiting enqueue");

            priorityQueueService.enqueueOrder(request);
            enqueueCounter.add(1);
            inProgressCounter.add(1);

            OrderEnqueueResponse response = OrderEnqueueResponse.newBuilder()
                    .setOrderId(request.getId())
                    .setStatus("ENQUEUED")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();

            log.info("[Order ID: {}] {}", request.getId(), "Order is enqueued");
        } catch (Exception e) {
            span.recordException(e);
            responseObserver.onError(e);
        } finally {
            long endTime = System.currentTimeMillis();
            enqueueLatencyHistogram.record(endTime - startTime);
            inProgressCounter.add(-1);
            span.end();
        }

    }

    @Override
    public void listenDequeuedOrders(OrderDequeueRequest request, StreamObserver<OrderEnqueueRequest> responseObserver) {
        Span span = tracer.spanBuilder("listenDequeuedOrders").startSpan();
        try (Scope scope = span.makeCurrent()) {
            listenForOrdersRecursively(responseObserver);
        } catch (Exception e) {
            span.recordException(e);
            responseObserver.onError(e);
        } finally {
            span.end();
        }
    }

    private void listenForOrdersRecursively(StreamObserver<OrderEnqueueRequest> responseObserver) {
        priorityQueueService.listenForNewOrders().thenAcceptAsync(order -> {
            if (order != null) {
                log.info("[Order ID: {}] Order is being processed", order.getId());
                responseObserver.onNext(order);
                listenForOrdersRecursively(responseObserver); // Correctly placed recursive call
            } else {
                responseObserver.onCompleted();
            }
        }).exceptionally(e -> {
            log.error("Error processing queue", e);
            responseObserver.onError(Status.INTERNAL.withCause(e).asRuntimeException());
            return null;
        });
    }

    private long getCurrentQueueSize() {
        // Implement logic to fetch the current size of the queue
        // Here, we'll just return a dummy value for illustration purposes
        return priorityQueueService.getQueueSize(); // Example method, replace with actual logic
    }
}
