package dev.sumantakumar.dateandtime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        int dd = localDateTime.getDayOfMonth();
        int mm = localDateTime.getMonthValue();
        int yyyy = localDateTime.getYear();

        System.out.printf("%d-%d-%d",dd,mm,yyyy);

        int h = localDateTime.getHour();
        int m = localDateTime.getMinute();
        int s = localDateTime.getSecond();
        int n = localDateTime.getNano();
        System.out.printf("\n%d:%d:%d:%d",h,m,s,n);

    }
}
