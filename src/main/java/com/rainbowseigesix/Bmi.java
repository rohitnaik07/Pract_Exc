package com.rainbowseigesix;

import java.lang.Math;

public class Bmi {
    public double bmiResult(double weight,double height){
        double BMIans;
        double cheight=Math.pow(height,2);
        BMIans = weight/cheight;
        System.out.println("BMI of the person is " + BMIans);
        return BMIans;
    }
}
