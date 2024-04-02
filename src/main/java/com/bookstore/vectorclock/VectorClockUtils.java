package com.bookstore.vectorclock;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.grpc.Metadata;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class VectorClockUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    public static final Metadata.Key<String> VECTOR_CLOCK_METADATA_KEY = Metadata.Key.of("vector-clock", Metadata.ASCII_STRING_MARSHALLER);

    public static Map<String, Long> extractVectorClockFromMetadata(Metadata headers) {
        // Attempt to get the serialized vector clock from the metadata
        String serializedVectorClock = headers.get(VECTOR_CLOCK_METADATA_KEY);
        if (serializedVectorClock == null) {
            // If no vector clock is present, return an empty map or handle appropriately
            return new HashMap<>();
        }

        // Deserialize the JSON string back into a Map<String, Long>
        try {
            return objectMapper.readValue(serializedVectorClock, new TypeReference<Map<String, Long>>() {});
        } catch (IOException e) {
            // Handle deserialization error
            e.printStackTrace();
            return new HashMap<>();
        }
    }

    public static String serializeVectorClock(Map<String, Long> vectorClock) {
        try {
            return objectMapper.writeValueAsString(vectorClock);
        } catch (JsonProcessingException e) {
            // Handle the case where the map cannot be serialized to JSON
            e.printStackTrace();
            return null;
        }
    }
}