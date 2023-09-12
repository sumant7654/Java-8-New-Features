package dev.sumantakumar.functionalinterface.premitivetype;

import java.util.function.ObjDoubleConsumer;


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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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


public class IncreaseSalaryUsingObjDoubleConsumer {
    public static void main(String[] args) {
        ObjDoubleConsumer<Worker> increase = (e, s) -> e.setSalary(e.getSalary()+s);
        Worker worker = new Worker(1, "Sumant", 10000);
        System.out.println("Before Increment:"+worker);
        increase.accept(worker, 1000);
        System.out.println("After Increment:"+worker);
    }
}
