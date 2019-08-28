package com.wetrade.utils;

public enum ResponseStatus {
    SUCCESS("Success"), ERROR("Error");

    final private String status;

    ResponseStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
