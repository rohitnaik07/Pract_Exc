package com.rainbowseigesix;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArmstrongTest {

    Armstrong underTest = new Armstrong();

    @Test
    public void armResultTest() {
        int number = 153;
        int finalresult = underTest.armResult(number);
        assertEquals(153,finalresult);
    }
}