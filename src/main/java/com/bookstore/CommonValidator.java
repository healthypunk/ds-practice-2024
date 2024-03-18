package com.bookstore;


import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.stream.Stream;

public class CommonValidator {
    public static boolean isNotNull(Object... objects) {
        return Stream.of(objects).allMatch(Objects::nonNull);
    }

    public static boolean isNotBlank(String... objects) {
        return Stream.of(objects).allMatch(StringUtils::isNotBlank);
    }
}
