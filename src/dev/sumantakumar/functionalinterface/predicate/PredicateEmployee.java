package dev.sumantakumar.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

class Employee{
    String name;
    String designation;
    double salary;
    String city;

    public Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(designation, employee.designation) && Objects.equals(city, employee.city);
    }


}
public class PredicateEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        populate(employees);


        Predicate<Employee> predicateManager = employee -> employee.designation.equals("SDE-II");
        Predicate<Employee> predicateCity = employee -> employee.city.equals("Ranchi");
        Predicate<Employee> predicateSalary = employee -> employee.salary < 3000000;
        Predicate<Employee> predicateIsEqual = Predicate.isEqual(new Employee("Sumanta", "SSDE", 5000000, "Angul"));

        display(predicateManager, employees);
        display(predicateCity, employees);
        display(predicateSalary, employees);

        display(predicateManager.and(predicateCity), employees);
        display(predicateManager.or(predicateSalary), employees);
        display(predicateManager.negate(), employees);
        display(predicateIsEqual, employees);
    }

    private static void display(Predicate<Employee> predicate, ArrayList<Employee> employees) {
        for(Employee e: employees){
            if(predicate.test(e)){
                System.out.println(e);
            }
        }
    }

    private static void populate(ArrayList<Employee> employees) {
        employees.add(new Employee("Sumanta", "SSDE", 5000000, "Angul"));
        employees.add(new Employee("Shadab", "SDE-II", 3500000, "Ranchi"));
        employees.add(new Employee("Swastik", "SDE-II", 3000000, "Jharsuguda"));
        employees.add(new Employee("Ankit", "SDE-I", 2000000, "Bhubaneswar"));
        employees.add(new Employee("Swagat", "SDE-I", 2400000, "Jajapur"));
    }
}
