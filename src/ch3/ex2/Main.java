package ch3.ex2;

public class Main {
    public static void main(String[] args) {
        IntSequence intSequence = IntSequence.constant(1);
        int times = 5;
        while(times-- != 0 && intSequence.hasNext()){
            System.out.println(intSequence.next());
        }

    }
}
