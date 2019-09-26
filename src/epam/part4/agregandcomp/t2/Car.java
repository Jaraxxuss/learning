package epam.part4.agregandcomp.t2;

public class Car {
    private final double tankSize;
    private final double fuelConsumption;
    private String mark;
    private Wheel[] wheels;
    private Engine engine;
    private double amountOfFuel;

    public Car(double tankSize, String mark, Wheel[] wheels, double amountOfFuel, double power, double fuelConsumption) {
        this.tankSize = tankSize;
        this.mark = mark;
        this.wheels = wheels;
        this.amountOfFuel = amountOfFuel;
        this.fuelConsumption = fuelConsumption;
        engine = new Engine(power);
    }

    void refuel(double amountOfFuel) {
        setAmountOfFuel(this.amountOfFuel + amountOfFuel);
    }

    public void setAmountOfFuel(double amountOfFuel) {
        if(amountOfFuel > tankSize){
            this.amountOfFuel = amountOfFuel = tankSize;
        }
        else {
            this.amountOfFuel = amountOfFuel;
        }

    }

    void printMark() {
        System.out.println("Mark : " + mark);
    }

    void changeWheel(int wheelNumber, Wheel wheel) {
        wheels[wheelNumber - 1] = wheel;
    }

    void drive(double distance) {
        double distanceLeft = distance;
        double step = 1;
        while (engine.isAlive() & isWheelsAlive() & distanceLeft != 0 & amountOfFuel > 0){
            engine.loseHealth(step);
            breakWheels(step);
            distanceLeft -= step;
            amountOfFuel -= step * fuelConsumption;
        }
        if(amountOfFuel < 0) amountOfFuel = 0;
        System.out.println("distance drove : " + (distance - distanceLeft) + "\n engine durability : " + engine.getHealth() + " fuelLeft : "  + amountOfFuel);
    }
    private boolean isWheelsAlive(){
        for (Wheel wheel : wheels) {
            if(!wheel.isAlive()){
                return false;
            }
        }
        return true;
    }
    private void breakWheels(double distance){
        for (Wheel wheel : wheels) {
            wheel.loseHealth(distance);
        }
    }

}
