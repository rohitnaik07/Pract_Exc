package com.rainbowseigesix;

public class SixPS {
    public static void main(String[] args){
        int armnumber=1634;
        double weight=55,height=1.7;
        long lnumber = 1346524199000l;
        int radius = 5;

        Armstrong obj = new Armstrong();
        obj.armResult(armnumber);

        Bmi obj2 = new Bmi();
        obj2.bmiResult(weight,height);

        LongDateTime obj3 = new LongDateTime();
        obj3.longConvert(lnumber);

        AreaOfCircle obj4 = new AreaOfCircle();
        obj4.areaofCircle(radius);

        MaxOfArray obj5 = new MaxOfArray();
        obj5.maxElement();

        Polymorphism obj6 = new Polymorphism();
        obj6.multiply(weight,height);
    }
}
