package com.brunopw.weshareapi.model;

public enum AccommodationType {
    APARTMENT(0),
    HOUSE(1),
    STUDIO(2);

    int value;
    AccommodationType(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }
}
