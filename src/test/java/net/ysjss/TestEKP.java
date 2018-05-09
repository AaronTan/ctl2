package net.ysjss;


import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEKP {

    @Test
    public void testDate(){
        String a1 = "2015年05月22日";
        System.out.println(a1.substring(0,4));
        System.out.println(a1.substring(5,7));
        System.out.println(a1.substring(8,10));
    }

    @Test
    public void testForm() throws Exception{
        Date d = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(Float.parseFloat("55"));
        System.out.println(sd.parse("2018-01-02"));
    }
}
