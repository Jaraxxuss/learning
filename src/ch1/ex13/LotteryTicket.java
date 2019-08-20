package ch1.ex13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class LotteryTicket {
    private ArrayList<Integer> elligbleNumbers;
    private int numberOfDigits;
    LotteryTicket(int between,int numberOfDigits){
        this.numberOfDigits = numberOfDigits;
        elligbleNumbers = new ArrayList<Integer>();
        for(int i = 1; i <=between; i++){
            elligbleNumbers.add(i);
        }

    }
    public String generateTicket(){
        Random random =new Random();
        ArrayList<Integer> myTicket = new ArrayList<Integer>();
        for(int i = 0; i < numberOfDigits; i++){
            int index = Math.floorMod(random.nextInt() + 1, elligbleNumbers.size());
            myTicket.add(elligbleNumbers.get(index));
            elligbleNumbers.remove(index);
        }
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        myTicket.sort(c);
        return myTicket.toString();
    }
}
