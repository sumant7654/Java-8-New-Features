package dev.sumantakumar.dateandtime;

import java.time.Year;
import java.util.Scanner;

public class CheckYearLeapOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int y = sc.nextInt();
        Year year = Year.of(y);
        if(year.isLeap()){
            System.out.printf("%d is a Leap Year", y);
        }else {
            System.out.printf("%d is not a Leap Year", y);
        }
    }
}
