package ch1.ex3;

import java.util.Scanner;

public class TestConditionalThreeNumbersClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ConditionalThreeNumbers obj = new ConditionalThreeNumbers(in.nextInt(),in.nextInt(),in.nextInt());
        System.out.println("1 method: " + obj.largestWithConditional());
        System.out.println("2 method: " + obj.largesWithMax());
    }
}
