package dev.sumantakumar.functionalinterface;

@FunctionalInterface
interface ParentInterfaceSameMethod{
    void m1();
}
@FunctionalInterface
public interface ValidFunctionalInterfaceInheritanceSameMethod extends ParentInterfaceSameMethod{
    void m1();
}
