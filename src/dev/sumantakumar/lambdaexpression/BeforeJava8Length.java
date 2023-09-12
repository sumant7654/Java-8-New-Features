package dev.sumantakumar.lambdaexpression;

interface LengthInterface{
    int getLength(String str);
}

class LengthClass implements LengthInterface{

    @Override
    public int getLength(String str) {
       return str.length();
    }
}
public class BeforeJava8Length {
    public static void main(String[] args) {
        LengthInterface lengthInterface = new LengthClass();
        int length = lengthInterface.getLength("Sumanta Kumar Sahoo");
        System.out.println("Length is ="+length);
    }
}
