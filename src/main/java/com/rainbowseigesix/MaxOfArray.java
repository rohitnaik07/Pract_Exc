package com.rainbowseigesix;

public class MaxOfArray {
    public int maxElement(){
        int array[] = {10,20,61,30,40,50};
        int max = array[0];
        for(int i=1;i< array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("maximum element of the array is "+ max);
        return max;
    }
}
