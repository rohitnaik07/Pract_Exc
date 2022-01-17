package com.rainbowseigesix;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class LongDateTimeTest {

    LongDateTime underTest = new LongDateTime();

    @Test
    public void longConvert() {
        long number = 1346524199000l;

        Date finalresult = underTest.longConvert(number);

        assertEquals("Sat Sep 01 23:59:59 IST 2012",finalresult);
        //assertEquals("Sat Sep 01 23:59:59 IST 2012",finalresult);
       // assertSame("Sat Sep 01 23:59:59 IST 2012",finalresult);
    }
}

