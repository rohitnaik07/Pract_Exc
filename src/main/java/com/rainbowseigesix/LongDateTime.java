package com.rainbowseigesix;

import java.util.Date;

public class LongDateTime {
    public Date longConvert(long lnumber){
        Date d = new Date(lnumber);
        System.out.println(d);
        return d;
    }
}
