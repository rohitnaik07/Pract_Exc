package com.rainbowseigesix;

import java.util.Date;

public class LongDateTime {
    public long longConvert(long lnumber){
        Date d = new Date(lnumber);
        System.out.println(d);
        return lnumber;
    }
}
