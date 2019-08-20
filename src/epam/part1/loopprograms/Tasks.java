package epam.part1.loopprograms;

import java.math.BigInteger;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

    }
    private static int summ(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int end = scanner.nextInt();
        int summ = 0;
        for (int i = 1; i < end + 1; i++) {
            summ += i;
        }
        return summ;
    }
    private static void valueOfFunction(int start,int end,int step){
        for (int i = start; i < end; i += step) {
            if(i > 2) System.out.println("x: " + i + "y: " + i);
            else System.out.println("x: " + i + "y: " + (-i));
        }
    }
    private static int summofSquares(final int number){
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += (i * i);
        }
        return sum;
    }
    private static BigInteger multiofSquares(final int number){
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 0; i < number; i++) {
            sum = sum.add(BigInteger.valueOf(i).pow(2));
        }
        return sum;
    }
    private static void deviders(final int num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("[a : b]");
        System.out.print("input a: ");
        final int start = scanner.nextInt();
        System.out.print("input b: ");
        int end = scanner.nextInt();
        if(end < num) end = num;
        System.out.println("Deviders of " + num + " from " + start + " to " + end + " are : ");
        for (int i = start == 1 ? start + 1 : start; i < end ;i++) {
            if(num % i == 0) System.out.print(i + " ");
        }
    }
}
