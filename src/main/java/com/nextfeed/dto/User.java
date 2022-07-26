package com.nextfeed.dto;

public record User(String name) {
    public String name() {
        return name;
    }
}
