package ch1.ex16;

import java.util.Arrays;

public class MethodAvg {
    public static void main(String[] args) {
        System.out.println(average(10));
    }
    public static int average(Integer... a){
        int result = 0;
        for(int i = 0; i < a.length; i++){
            result += a[i].intValue();
        }
        return result/a.length;
    }


}

