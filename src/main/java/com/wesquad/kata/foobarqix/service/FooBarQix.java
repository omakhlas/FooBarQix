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
        if(val.contains("3")) {
            int a = count(val)[3];
            while(a-->0)
                sb.append("Foo");
        }
        if(val.contains("5")) {
            int a = count(val)[5];
            while(a-->0)
                sb.append("Bar");
        }
        if(val.contains("7")) {
            int a = count(val)[7];
            while(a-->0)
                sb.append("Qix");
        }
        if(sb.length() != 0) return sb.toString();
        return val;
    }

    public int[] count(String s) {
        int[] arr = new int[26];
        for(char c : s.toCharArray()) arr[c-'0']++;
        return arr;
    }

}
