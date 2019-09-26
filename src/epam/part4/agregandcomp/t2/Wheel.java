package epam.part4.agregandcomp.t2;

public class Wheel implements Healthable {
    private double radius;
    private double health;
    private WheelType type;
    final double wheelLife = 100;

    public Wheel(double radius, WheelType type) {
        this.radius = radius;
        this.type = type;
        health = 100;
    }

    public double getRadius() {
        return radius;
    }

    public double getHealth() {
        return health;
    }

    public WheelType getType() {
        return type;
    }

    @Override
    public void loseHealth(double distance) {
        health -= distance / wheelLife;
    }

    @Override
    public boolean isAlive() {
        return health != 0;
    }
}

enum WheelType {
    WINTER,
    SUMMER
}
