package com.rainbowseigesix;

import org.junit.Test;

import static org.junit.Assert.*;

public class BmiTest {

    Bmi underTest = new Bmi();

    @Test
    public void bmiResultTest() {
        double weight=55,height=1.7;
        double finalresult = underTest.bmiResult(weight,height);

        assertEquals(19.03,finalresult,2);
    }
}