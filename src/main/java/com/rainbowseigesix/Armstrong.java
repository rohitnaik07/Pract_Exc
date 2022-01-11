package com.rainbowseigesix;

import java.lang.Math;

public class Armstrong {
    public int armResult(int armnumber){
        int temp,rem;
        int count=0,result=0;
        temp = armnumber;

        while(temp!=0){
            temp = temp/10;
            count++;
        }

        temp=armnumber;

        while(temp>0){
            rem = temp%10;
            result += Math.pow(rem,count);
            temp = temp/10;
        }

        if(armnumber==result){
            System.out.println(armnumber +" is an armstrong number");
        }
        else{
            System.out.println(armnumber +" is not an armstrong number");
        }

        return result;
    }
}
