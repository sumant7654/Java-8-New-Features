package dev.sumantakumar.functionalinterface.bi.function;

import java.util.function.BiFunction;

class Worker{
    private int id;
    private String name;
    private double salary;

    public Worker(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class TimeSheet{
    private int empId;
    private int days;

    public TimeSheet(int empId, int days) {
        this.empId = empId;
        this.days = days;
    }

    public int getEmpId() {
        return empId;
    }

    public int getDays() {
        return days;
    }
}

public class MonthlySalary {
    public static void main(String[] args) {
        BiFunction<Worker, TimeSheet, Double> getSalary = (emp, ts) -> emp.getSalary() * ts.getDays();

        System.out.println(getSalary.apply(new Worker(1,"Sumant", 1000.00),
                new TimeSheet(1, 30)));

        System.out.println(getSalary.apply(new Worker(2,"Achintya", 1100.00),
                new TimeSheet(2, 28)));
    }
}
