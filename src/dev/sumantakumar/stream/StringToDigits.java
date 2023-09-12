package dev.sumantakumar.stream;

public class StringToDigits {
    public static void main(String[] args) {
        String S = "36a1";
        int result;
        int sum = 0;
        for(int i = 0; i< S.length(); i++){
            int value = 0;
            if(S.charAt(i) > 93) {
                int a = S.charAt(i) - 96;
                System.out.println(a);
                value = a;
            }else{
                System.out.println(S.charAt(i));
                value = (int) S.charAt(i);
                value -= 48;
            }
            sum+=value;
        }
        System.out.println(sum);
    }
}
