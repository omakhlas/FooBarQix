package com.wesquad.kata.foobarqix;

import com.wesquad.kata.foobarqix.service.FooBarQix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FooBarQixTest {
    FooBarQix fooBarQix;
    @BeforeEach
    public void init(){
        fooBarQix = new FooBarQix();
    }

    @Test
    public void shouldReturn1WhenNumberIs1() {
        assertEquals("1", fooBarQix.printValue("1"));
    }
    @Test
    public void shouldReturn2WhenNumberIs2() {
        assertEquals("2", fooBarQix.printValue("2"));
    }
    @Test
    public void shouldReturnFooFooWhenNumberIs3() {
        assertEquals("FooFoo", fooBarQix.printValue("3"));
    }
    @Test
    public void shouldReturnBarBarWhenNumberIs5() {
        assertEquals("BarBar", fooBarQix.printValue("5"));
    }

    @Test
    public void shouldReturnFooWhenNumberIs6() {
        assertEquals("Foo", fooBarQix.printValue("6"));
    }

    @Test
    public void shouldReturnFooWhenNumberIs13() {
        assertEquals("Foo", fooBarQix.printValue("13"));
    }
    @Test
    public void shouldReturnFooBarBarWhenNumberIs15() {
        assertEquals("FooBarBar", fooBarQix.printValue("15"));
    }

    @Test
    public void shouldReturnFooFooFooWhenNumberIs33() {
        assertEquals("FooFooFoo", fooBarQix.printValue("33"));
    }

    @Test
    public void shouldReturnBarFooWhenNumberIs53() {
        assertEquals("BarFoo", fooBarQix.printValue("53"));
    }

    @Test
    public void shouldReturnFooBarWhenNumberIs51() {
        assertEquals("FooBar", fooBarQix.printValue("51"));
    }

    @Test
    public void shouldReturnFooFooFooWhenNumberIs303() {
        assertEquals("FooFoo*Foo", fooBarQix.printValue("303"));
    }

    //* is replaced by _ on the test name
    @Test
    public void shouldReturnFooQix__WhenNumberIs10101() {
        assertEquals("FooQix**", fooBarQix.printValue("10101"));
    }

    @Test
    public void shouldReturn1_1WhenNumberIs101() {
        assertEquals("1*1", fooBarQix.printValue("101"));
    }

    @Test
    public void shouldReturnFooBarQix_BarWhenNumberIs101() {
        assertEquals("FooBarQix*Bar", fooBarQix.printValue("105"));
    }
}
