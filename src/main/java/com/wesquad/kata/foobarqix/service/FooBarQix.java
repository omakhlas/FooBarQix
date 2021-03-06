package com.wesquad.kata.foobarqix.service;

public class FooBarQix {
    public String printValue(String val) {
        StringBuilder sb = new StringBuilder();
        if(Integer.parseInt(val)%3 == 0) {
            sb.append("Foo");
        }
        if(Integer.parseInt(val)%5 == 0) {
            sb.append("Bar");
        }
        if(Integer.parseInt(val)%7 == 0) {
            sb.append("Qix");
        }
        for(char c : val.toCharArray()) {
            if(sb.length() != 0) if("0".equals(String.valueOf(c))) sb.append("*");
            if("3".equals(String.valueOf(c))) sb.append("Foo");
            if("5".equals(String.valueOf(c))) sb.append("Bar");
            if("7".equals(String.valueOf(c))) sb.append("Qix");
        }

        if(sb.length() != 0) return sb.toString();
        else {
            for(char c : val.toCharArray()) {
                if(c != '0') sb.append(c);
                else sb.append("*");
            }
        }
        return sb.toString();
    }


}
