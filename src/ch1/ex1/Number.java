package ch1.ex1;
public class Number {
    private int num;
    Number(int num){
        this.num = num;
    }
    public void printBinaryNumber(){
        System.out.printf("Binary : " + Integer.toBinaryString(num) +'\n');
    }
    public void printOctalNumber(){
        System.out.printf("Octal : " + Integer.toOctalString(num +'\n'));
    }
    public void printHexNumber(){
        System.out.printf("Hex : " + Integer.toHexString(num) +'\n');
    }
    public void printDecimalNumber(){
        System.out.printf("Decimal : " + Integer.toString(num) +'\n');
    }
}
