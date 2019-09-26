package epam.part4.agregandcomp.t2;

public class Runner {
    public static void main(String[] args) {
        Wheel[]wheels = new Wheel[]{new Wheel(18,WheelType.SUMMER),
                                    new Wheel(18,WheelType.SUMMER),
                                    new Wheel(18,WheelType.SUMMER),
                                    new Wheel(18,WheelType.SUMMER)};
        Car car = new Car(50,"bmw",wheels,45,200,7);
        car.drive(10);

    }
}
