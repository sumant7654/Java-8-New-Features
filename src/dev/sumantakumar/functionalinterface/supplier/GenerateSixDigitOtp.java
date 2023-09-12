package dev.sumantakumar.functionalinterface.supplier;

import java.util.function.Supplier;

public class GenerateSixDigitOtp {
    public static void main(String[] args) {
        Supplier<String> getSixDigitOtp = () ->{
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < 6; i++) {
                str.append((int) (Math.random() * 10));
            }
            return new String(str);
        };


        System.out.println(getSixDigitOtp.get());
        System.out.println(getSixDigitOtp.get());
        System.out.println(getSixDigitOtp.get());
        System.out.println(getSixDigitOtp.get());
    }
}
