package com.server.app.times;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class UTC {
    public UTC(){

    }
    public static void UTC(){
        Instant utcTime = Instant.now(); // يمكن أن يكون أي توقيت UTC هنا

        // تنسيق التوقيت إلى سلسلة نصية بتوقيت UTC
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                .withZone(ZoneId.of("UTC"));
        String formattedTime = utcTime.atZone(ZoneId.of("UTC")).format(formatter);

        System.out.println(formattedTime);
    }
    public static String add20Minutes(String UTCTime){
        int year, month, day, hour, minute, second;
        return "";
    }
}
