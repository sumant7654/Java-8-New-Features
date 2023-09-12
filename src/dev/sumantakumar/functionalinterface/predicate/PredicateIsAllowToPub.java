package dev.sumantakumar.functionalinterface.predicate;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

class SoftwareEngineer{
    String name;
    int age;
    boolean isHavingGf;

    public SoftwareEngineer(String name, int age, boolean isHavingGf) {
        this.name = name;
        this.age = age;
        this.isHavingGf = isHavingGf;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isHavingGf=" + isHavingGf +
                '}';
    }
}
public class PredicateIsAllowToPub {
    public static void main(String[] args) {
        Predicate<SoftwareEngineer> pubPredicate = softwareEngineer -> softwareEngineer.isHavingGf && softwareEngineer.age > 25;
        SoftwareEngineer[] softwareEngineers = {
                new SoftwareEngineer("Sumanta Kumar", 29, false),
                new SoftwareEngineer("Ankit", 25, true),
                new SoftwareEngineer("Shadab", 26, false),
                new SoftwareEngineer("Satya", 26, true),
                new SoftwareEngineer("Nitish", 22, false),
                new SoftwareEngineer("Swagat", 26, false)
        };

        for (SoftwareEngineer se : softwareEngineers){
            if(pubPredicate.test(se)){
                System.out.println(se);
            }
        }
    }
}
