package dev.sumantakumar.dateandtime;

import java.time.LocalDate;

public class DayMonthYearUsingLocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        int date = localDate.getDayOfMonth();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();

        System.out.printf("%d-%d-%d",date,month,year);
    }
}
