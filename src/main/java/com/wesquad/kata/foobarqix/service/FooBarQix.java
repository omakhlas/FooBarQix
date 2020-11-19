package com.wesquad.kata.foobarqix.service;

public class FooBarQix {
    public String printValue(String val) {
        if(Integer.parseInt(val)%3 == 0) {
            if (val.contains("3")) return "FooFoo";
            else return "Foo";
        }
        if(Integer.parseInt(val)%5 == 0) {
            if (val.contains("5")) return "BarBar";
            else return "Bar";
        }
        return val;
    }

}
