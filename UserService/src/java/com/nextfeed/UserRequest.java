package com.nextfeed;

public record UserRequest(String name) {
    public String name() {
        return name;
    }
}
