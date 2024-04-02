package com.bookstore.vectorclock;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class VectorClockService {
    private final String nodeId;

    private final Map<String, Long> vectorClock = new HashMap<>();

    public VectorClockService(@Value("${vectorclock.nodeId}") String nodeId) {
        this.nodeId = nodeId;
    }

    public void updateVectorClock(Map<String, Long> clientVectorClock) {
        vectorClock.putAll(Stream.of(vectorClock, clientVectorClock).flatMap(m -> m.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Math::max)));
        vectorClock.merge(nodeId, 1L, Long::sum);
    }

    public void updateOnlyVectorClock(Map<String, Long> clientVectorClock) {
        vectorClock.putAll(Stream.of(vectorClock, clientVectorClock).flatMap(m -> m.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Math::max)));
    }

    public Map<String, Long> getVectorClock() {
        return vectorClock;
    }
}