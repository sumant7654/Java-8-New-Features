package dev.sumantakumar.dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1994, Month.JUNE, 22);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthDay, today);
        System.out.printf("Your Age is %d year, %d month and %d days", p.getYears(), p.getMonths(), p.getDays());


        LocalDate lwd = LocalDate.of(2023, Month.SEPTEMBER, 18);

        Period l = Period.between(today, lwd);
        System.out.printf("\nYou have left %d year, %d month and %d days to work at current organization", l.getYears(), l.getMonths(), l.getDays());

    }
}
