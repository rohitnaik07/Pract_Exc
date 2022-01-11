package com.rainbowseigesix;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongDateTimeTest {

    LongDateTime underTest = new LongDateTime();

    @Test
    public void longConvert() {
        long number = 1346524199000l;

        long finalresult = underTest.longConvert(number);

        assertEquals(number,finalresult);
    }
}