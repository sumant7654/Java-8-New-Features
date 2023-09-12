package dev.sumantakumar.functionalinterface;

@FunctionalInterface
interface ParentInterface{
    void m1();
}

@FunctionalInterface
public interface ValidFunctionalInterfaceInheritance extends ParentInterface{

}
