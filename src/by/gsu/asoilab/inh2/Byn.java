package by.gsu.asoilab.inh2;

public class Byn {
    private int numberOfKopecks;

    public Byn(int numberOfKopecks) {
        this.numberOfKopecks = numberOfKopecks;
    }
    public Byn(Byn byn) {
        numberOfKopecks = byn.numberOfKopecks;
    }
    @Override
    public String toString() {
        return getRubs() + "." + getKops() / 10 + getKops() % 10;
    }

    public int getRubs(){
        return numberOfKopecks / 100;
    }

    public int getKops(){
        return (numberOfKopecks % 100);
    }

    Byn add(Byn byn){
        numberOfKopecks += byn.getKops();
        return this;
    }

    Byn sub(Byn byn){
        numberOfKopecks -= byn.getKops();
        return this;
    }

    Byn mul(int k){
        numberOfKopecks *= k;
        return this;
    }

    Byn mul(double x){
        numberOfKopecks = (int)Math.round(numberOfKopecks * x);
        return this;
    }

}
