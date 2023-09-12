package dev.sumantakumar.functionalinterface.premitivetype;

import java.util.function.IntSupplier;

public class PrimitiveRandom {
    public static void main(String[] args) {
        IntSupplier getRandom = () -> (int) (Math.random() * 10);
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < 6; i++){
            sb.append(getRandom.getAsInt());
        }
        System.out.println(sb);
    }
}
