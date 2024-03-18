package com.bookstore;

import java.util.Objects;
import java.util.stream.Stream;

public class CommonValidator {
    public static boolean isNotNull(Object... objects) {
        return Stream.of(objects).allMatch(Objects::nonNull);
    }
}
