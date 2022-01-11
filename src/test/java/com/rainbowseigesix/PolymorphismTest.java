package com.rainbowseigesix;

import org.junit.Test;

import static org.junit.Assert.*;

public class PolymorphismTest {

    Polymorphism underTest = new Polymorphism();

    @Test
    public void multiply1Test() {
        int result = underTest.multiply(3,4);
        assertEquals(12,12);
    }

    @Test
    public void multiply2Test() {
        double result = underTest.multiply(3.5,4.5);
        assertEquals(15.75,result,2);
    }
}
