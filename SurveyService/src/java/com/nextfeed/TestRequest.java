package com.nextfeed;

public record TestRequest(String test) {
    public String test() {
        return test;
    }
}
