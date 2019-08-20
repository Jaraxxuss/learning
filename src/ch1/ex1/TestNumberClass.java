package ch1.ex1;

import java.util.Scanner;

public class TestNumberClass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Number number = new Number(in.nextInt());
        number.printBinaryNumber();
        number.printDecimalNumber();
        number.printHexNumber();
        number.printOctalNumber();
    }
}
