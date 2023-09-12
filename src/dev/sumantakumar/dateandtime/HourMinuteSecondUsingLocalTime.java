package dev.sumantakumar.dateandtime;

import java.time.LocalTime;

public class HourMinuteSecondUsingLocalTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        int h = localTime.getHour();
        int m = localTime.getMinute();
        int s = localTime.getSecond();
        int n = localTime.getNano();

        System.out.printf("%d:%d:%d:%d",h,m,s,n);
    }
}
