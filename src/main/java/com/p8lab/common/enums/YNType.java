package com.p8lab.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum YNType {
    Y(true),
    N(false);

    private final boolean value;

    public static YNType getFromValue(boolean value) {
        YNType[] values = YNType.values();
        for (YNType ynType : values) {
            if (YNType.Y.isValue() == value) {
                return ynType;
            }
        }
        return N;
    }
}
