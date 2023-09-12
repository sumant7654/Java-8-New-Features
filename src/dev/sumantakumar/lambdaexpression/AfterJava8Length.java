package dev.sumantakumar.lambdaexpression;

public class AfterJava8Length {
    public static void main(String[] args) {
        LengthInterface lengthInterface = str -> str.length();
        int length = lengthInterface.getLength("Sumanta Kumar Sahoo");
        System.out.println("Length is ="+length);
    }
}
