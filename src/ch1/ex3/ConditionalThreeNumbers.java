package ch1.ex3;

public class ConditionalThreeNumbers {
    private int num1,num2,num3;
    ConditionalThreeNumbers(int num1,int num2,int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    public int largestWithConditional(){
        if(num1 > num2){
           if(num1 > num3) return num1;
           else return num3;
        }
        else if(num2 > num3) return num2;
        else return num3;
    }
    public int largesWithMax(){
       return Math.max(Math.max(num1,num2),num3);
    }
}
