package by.gsu.asoilab;

public class ExtraTrial extends Trial {
    private int mark3;
    private static final int PASS_MARK3 = 60;

    public ExtraTrial(String name, int mark1, int mark2, int mark3) {
        super(name, mark1, mark2);
        this.mark3 = mark3;
    }

    public ExtraTrial() {
    }

    public int getMark3() {
        return mark3;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        int index = str.lastIndexOf(";");
        str.insert(index + 1,mark3 + ";");
        return str.toString();
    }

    @Override
    public boolean isPassed() {
        return super.isPassed() && mark3 > PASS_MARK3;
    }



    @Override
    public double avgSum() {
        return (super.result() + mark3) / 3;
    }

    @Override
    public void setMarksToZero() {
        super.setMarksToZero();
        mark3 = 0;
    }

}
