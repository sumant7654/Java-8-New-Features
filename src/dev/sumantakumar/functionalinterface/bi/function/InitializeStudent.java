package dev.sumantakumar.functionalinterface.bi.function;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student{
    private String name;
    private String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

public class InitializeStudent {

    public static void main(String[] args) {
        BiFunction<String, String, Student> initialize = (name, department) -> new Student(name, department);

        ArrayList<Student> students = new ArrayList<>();

        students.add(initialize.apply("Sumant", "Computer Application"));
        students.add(initialize.apply("Shadab", "Computer Science"));
        students.add(initialize.apply("Swastik", "Mechanical"));
        students.add(initialize.apply("Ankit", "Mechanical"));

        students.forEach(System.out::println);
    }

}
