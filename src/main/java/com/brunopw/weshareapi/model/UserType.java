package com.brunopw.weshareapi.model;

public enum UserType {
    LANDLORD(0),
    TENANT(1);

    int value;
    UserType(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }
}
