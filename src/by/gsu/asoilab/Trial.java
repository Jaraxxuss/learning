package by.gsu.asoilab;

public class Trial {
    private String name;
    private int mark1;
    private int mark2;
    public static final int PASS_MARK = 120;

    public Trial(String name, int mark1, int mark2) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
    public Trial() {
    }
    public Trial(String name) {
        this(name,0,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }
    protected int result() {
        return mark1 + mark2;
    }
    public boolean isPassed() {
        return result() >= PASS_MARK;
    }
    @Override
    public String toString() {
        return name + ";" + mark1 + ";" + mark2 + ";" + isPassed();
    }

    public double avgSum(){
       return result() / 2;
    }
    public void setMarksToZero(){
        mark1 = 0;
        mark2 = 0;
    }


}
