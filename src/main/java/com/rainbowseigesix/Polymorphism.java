package com.rainbowseigesix;

public class Polymorphism {
    public int multiply(int a,int b){
        int mul1 = a*b;
        System.out.println(mul1);
        return mul1;
    }
    public double multiply(double a,double b){
        double mul2 = a*b;
        System.out.println("Multiplication of two nos is "+ mul2);
        return mul2;
    }
}
