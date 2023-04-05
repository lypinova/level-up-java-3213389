package com.linkedin.javacodechallenges;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class App 
{
    /**
     * 
     */
    public static void calculateDate() {
         final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date currentDate = new Date();


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        calendar.add(Calendar.DATE, 100);

        Date currentDatePlusHundred = calendar.getTime();

        System.out.println(dateFormat.format(currentDatePlusHundred));



    }
    // Create function to calculate the date that's 
    // 100 days from now

    public static void main( String[] args )
    {
        //    System.out.println("100 days from now is... " 
         //   /* add function call */);
        calculateDate();
    }
}
