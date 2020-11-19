package com.wesquad.kata.foobarqix.service;

public class FooBarQix {
    public String printValue(String val) {
        if(val.contains("3") && Integer.parseInt(val)%3 == 0) return "FooFoo";
        if(val.equals("1")) return "1";
        return "2";
    }
}
