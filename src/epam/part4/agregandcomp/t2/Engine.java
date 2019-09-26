package epam.part4.agregandcomp.t2;

public class Engine implements Healthable {
    double power;
    double health;
    final double engineLife = 1000;
    public Engine(double power) {
        health = 100;
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public double getHealth() {
        return health;
    }

    @Override
    public void loseHealth(double distance) {
        health -= distance / engineLife;
    }

    @Override
    public boolean isAlive() {
        return health != 0;
    }


}
