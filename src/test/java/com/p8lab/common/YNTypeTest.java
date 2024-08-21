package com.p8lab.common;

import com.p8lab.common.enums.YNType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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