package ch1.ex10;

import java.util.Random;

public class Convert {
    private final static char[] alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    public static void main(String[] args) {
        Random random = new Random();
        long number =random.nextLong();
        System.out.println(number + " : " + convert(number,36));

    }
    public static String convert(long number,int radix ){
        boolean isNeg = false;
        if(number < 0){
            isNeg = true;
            number *=-1;
        }
        StringBuilder stringValue = new StringBuilder("");
        while(number != 0){
            stringValue.append(alphabet[(int)(number % radix)]);
            number /= radix;
        }
        if(isNeg)stringValue.append('-');
        stringValue.reverse();
        return stringValue.toString();
    }
}
