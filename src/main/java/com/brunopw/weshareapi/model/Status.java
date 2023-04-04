package com.brunopw.weshareapi.model;

public enum Status {
    ACTIVE(0),
    INACTIVE(1);

    int value;
    Status(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }
}
