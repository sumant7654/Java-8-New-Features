package dev.sumantakumar.functionalinterface.premitivetype;

import java.util.function.IntPredicate;

public class IsEvenNumber {
    public static void main(String[] args) {
        IntPredicate isEven = number -> number % 2 == 0;

        int[] x = {1,2,3,4,5,6,7,8,9};
        for(int i : x){
            if(isEven.test(i)){
                System.out.println(i);
            }
        }
    }
}
