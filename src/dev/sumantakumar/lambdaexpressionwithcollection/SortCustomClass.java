package dev.sumantakumar.lambdaexpressionwithcollection;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class SortCustomClass {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(163, "Sumanta Kumar"));
        employees.add(new Employee(402, "Satya"));
        employees.add(new Employee(201, "Swastik"));
        employees.add(new Employee(278, "Swagat"));
        employees.add(new Employee(345, "Ankit"));

        System.out.println("Before Sorting : "+employees);
        Collections.sort(employees, (e1, e2) -> e2.getId() - e1.getId());
        System.out.println("After Sorting : "+employees);
    }
}
