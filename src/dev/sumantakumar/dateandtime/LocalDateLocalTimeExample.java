package dev.sumantakumar.dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateLocalTimeExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date = "+localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time = "+localTime);

    }
}
