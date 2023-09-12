package dev.sumantakumar.functionalinterface.bi;



import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class IncreaseSalary {
    public static void main(String[] args) {
        BiFunction<String, Double, Employee> initialize =  (name, salary) -> new Employee(name, salary);
        BiConsumer<Employee, Double> increase =  (emp, increment) -> emp.setSalary(emp.getSalary()+increment);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(initialize.apply("Sumanta", 1000.00));
        employees.add(initialize.apply("Achintya", 1100.00));
        employees.add(initialize.apply("Pravas", 1200.00));

        System.out.println("Initial Salary");
        employees.forEach(System.out::println);


        for(Employee e : employees){
            increase.accept(e, (e.getSalary() * 20) / 100);
        }

        System.out.println("Salary After Increment");
        employees.forEach(System.out::println);

    }
}
