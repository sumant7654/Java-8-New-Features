package dev.sumantakumar.functionalinterface.consumer;

import dev.sumantakumar.functionalinterface.function.FindGrade;
import dev.sumantakumar.functionalinterface.function.StudentGrade;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DisplayStudentInfo {
    public static void main(String[] args) {
        ArrayList<StudentGrade> students = new ArrayList<>();
        FindGrade.populate(students);
        Predicate<StudentGrade> predicate = studentGrade -> studentGrade.getMark() >= 60;
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
        Consumer<String> printData = studentGrade -> System.out.println(studentGrade);
        for(StudentGrade sg : students){
            if(predicate.test(sg)){
                String apply = findGrade.apply(sg);
                printData.accept(apply);
            }
        }

    }
}
