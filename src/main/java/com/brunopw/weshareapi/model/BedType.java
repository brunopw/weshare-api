package com.brunopw.weshareapi.model;

public enum BedType {
    SINGLE(0),
    BUNK(1),
    DOUBLE(2),
    QUEEN(3),
    KING(4);

    int value;
    BedType(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }
}
