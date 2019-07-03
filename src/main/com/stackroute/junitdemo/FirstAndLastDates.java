package com.stackroute.junitdemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class FirstAndLastDates {

        public String getdate()
        {
            Calendar calendar = Calendar.getInstance();
            String result="";

            calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

            DateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
            result=result+(dateFormat.format(calendar.getTime()));
            result=result+"\n";
            for (int i = 0; i <6; i++) {
                calendar.add(Calendar.DATE, 1);
            }
            result=result+(dateFormat.format(calendar.getTime()));

            return result;
        }

}