package com.rainbowseigesix;

import java.lang.Math;

public class Bmi {
    public double bmiResult(double weight,double height){
        double bmiAns;
        double cHeight=Math.pow(height,2);
        bmiAns = weight/cHeight;
        System.out.println("BMI of the person is " + bmiAns);
        return bmiAns;
    }
}
