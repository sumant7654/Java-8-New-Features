package dev.sumantakumar.functionalinterface.function;

import java.util.ArrayList;
import java.util.function.Function;

public class FindGrade {
    public static void main(String[] args) {
        ArrayList<StudentGrade> students = new ArrayList<>();
        populate(students);

        Function<StudentGrade, String> findGrade = studentGrade -> {
            Integer mark = studentGrade.getMark();
            if(mark >= 80){
                return "A";
            } else if (mark >= 60) {
                return "B";
            } else if (mark >= 45) {
                return "C";
            } else if (mark >= 35) {
                return "D";
            }else {
                return "E";
            }
        };

        for(StudentGrade sg : students){
            System.out.println(sg+"\t=>\t"+findGrade.apply(sg));
        }
    }

    public static void populate(ArrayList<StudentGrade> students) {
        students.add(new StudentGrade("Sumanta", 30));
        students.add(new StudentGrade("Shadab", 80));
        students.add(new StudentGrade("Swastik", 75));
        students.add(new StudentGrade("Ankit", 40));
        students.add(new StudentGrade("Swagat", 60));
    }
}
