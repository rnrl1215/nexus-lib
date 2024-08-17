package com.example.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YNTypeTest {
    @Test
    void whenYThenTrue() {
        boolean value = YNType.Y.isValue();
        Assertions.assertThat(value).isTrue();
    }

    @Test
    void whenNThenFalse() {
        boolean value = YNType.N.isValue();
        Assertions.assertThat(value).isFalse();
    }
}