package by.gsu.asoilab.inh3;


import java.util.Scanner;

public class Byn implements Comparable<Byn> {
    private final int numberOfKopecks;

    public Byn(int numberOfKopecks) {
        this.numberOfKopecks = numberOfKopecks;
    }

    public Byn(Scanner scanner){
        numberOfKopecks = scanner.nextInt();
    }

    public Byn(Byn byn) {
        numberOfKopecks = byn.numberOfKopecks;
    }
    @Override
    public String toString() {
        return getRubs() + "." + getKops() / 10 + getKops() % 10;
    }

    @Override
    public int compareTo(Byn o) {
        return numberOfKopecks - o.numberOfKopecks;
    }

    public int getRubs(){
        return numberOfKopecks / 100;
    }

    public int getKops(){
        return (numberOfKopecks % 100);
    }

    public Byn add(Byn byn){
        return new Byn(numberOfKopecks + byn.getKops());
    }

    public Byn sub(Byn byn){
        return new Byn(numberOfKopecks - byn.getKops());
    }

    public Byn mul(int k){
        return new Byn(numberOfKopecks * k);
    }

    public Byn mul(double x){
        return new Byn((int)Math.round(numberOfKopecks * x));
    }

    public Byn roundDownToOne(){
        return new Byn(getRubs() * 100);
    }
}
