package ch1.ex6;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int x){
        if(x == 0) return BigInteger.valueOf(0);
        BigInteger value =new BigInteger("1");
        for(int i = 1; i <= x; i++){
            value = value.multiply(BigInteger.valueOf(i));
        }
        return value;
    }

}
