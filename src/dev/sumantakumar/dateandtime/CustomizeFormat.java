package dev.sumantakumar.dateandtime;

import java.time.LocalDateTime;
import java.time.Month;

public class CustomizeFormat {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(1994, Month.JUNE,22,12,45);
        System.out.println(localDateTime);

        System.out.println("After 6 Months = "+localDateTime.plusMonths(6));
    }
}
