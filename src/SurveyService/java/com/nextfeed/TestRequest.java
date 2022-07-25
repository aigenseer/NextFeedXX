package com.nextfeed;

public record TestRequest(String name) {
    public String name() {
        return name;
    }
}
