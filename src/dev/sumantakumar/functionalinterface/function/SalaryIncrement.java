package dev.sumantakumar.functionalinterface.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class SalaryIncrement {
    public static void main(String[] args) {
        ArrayList<EmployeeSalary> salaries = new ArrayList<>();
        EmployeeMonthSalary.populate(salaries);

        System.out.println("Employee Before Increment");
        System.out.println(salaries);

        Predicate<EmployeeSalary> lessSalary = e -> e.getSalary() < 60000;

        Function<EmployeeSalary, EmployeeSalary> incrementedSalary = employeeSalary -> {
            employeeSalary.setSalary(employeeSalary.getSalary() + 5000);
            return employeeSalary;
        };
        ArrayList<EmployeeSalary> newSalaries = new ArrayList<>();
        for(EmployeeSalary e : salaries){
            if(lessSalary.test(e)){
                incrementedSalary.apply(e);
                newSalaries.add(e);
            }
        }
        System.out.println("Employee with incremented salary");
        System.out.println(newSalaries);
    }
}
