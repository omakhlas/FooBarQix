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


}
