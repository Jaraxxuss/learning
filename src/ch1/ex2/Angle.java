package ch1.ex2;

public class Angle {
    private int ang;
    Angle(int ang){
        this.ang = ang;
    }
    public void doWithModOperator(){
        ang = ((ang % 360) + 360) % 360;
    }
    public void doWithFloorMode(){
        ang = Math.floorMod(ang,360);
    }
    public void printAngle(){
        System.out.println("Angle is " + ang + '\n');
    }
}
