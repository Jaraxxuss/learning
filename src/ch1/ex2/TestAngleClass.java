package ch1.ex2;

import java.util.Scanner;

public class TestAngleClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Angle angle1 = new Angle(in.nextInt());
        angle1.doWithModOperator();
        angle1.printAngle();
        Angle angle2 = new Angle(in.nextInt());
        angle2.doWithFloorMode();
        angle2.printAngle();
    }
}
