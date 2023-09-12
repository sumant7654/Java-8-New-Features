package dev.sumantakumar.functionalinterface.function;

import java.util.ArrayList;
import java.util.function.Function;

class EmployeeSalary{
    private String name;
    private double salary;

    public EmployeeSalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class EmployeeMonthSalary {
    public static void main(String[] args) {
        ArrayList<EmployeeSalary> employees = new ArrayList<>();
        populate(employees);

        Function<ArrayList<EmployeeSalary>, Double> findTotalSalary = all -> {
            Double total = 0.0;
            for(EmployeeSalary emp : all){
                total+=emp.getSalary();
            }
            return total;
        };
        System.out.println(findTotalSalary.apply(employees));
    }

    public static void populate(ArrayList<EmployeeSalary> employees) {
        employees.add(new EmployeeSalary("Sumanta", 50000));
        employees.add(new EmployeeSalary("Shadab", 60000));
        employees.add(new EmployeeSalary("Swastik", 60000));
        employees.add(new EmployeeSalary("Satya", 55000));
    }
}
