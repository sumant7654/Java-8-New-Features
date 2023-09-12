package dev.sumantakumar.methodreference;

interface Interf{
    void m1();
}
public class MethodReferenceExample {
    public static void main(String[] args) {
       Interf i = MethodReferenceExample::m2;
       i.m1();
    }

    public static void m2(){
        System.out.println("Implementation for Method Reference :: ");
    }
}
