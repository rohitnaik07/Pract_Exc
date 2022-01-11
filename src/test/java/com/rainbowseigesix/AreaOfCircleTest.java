package com.rainbowseigesix;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreaOfCircleTest {

    AreaOfCircle underTest = new AreaOfCircle();

    @Test
    public void areaofCircleTest() {
        double result = underTest.areaofCircle(5);
        assertEquals(78.5,result,2);
    }
}