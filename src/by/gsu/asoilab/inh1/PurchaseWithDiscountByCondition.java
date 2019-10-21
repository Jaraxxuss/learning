package by.gsu.asoilab.inh1;

public class PurchaseWithDiscountByCondition extends Purchase {
    private static final int MAX_NUMBER = 2;
    private final double percentDiscount;

    public PurchaseWithDiscountByCondition(String name, int price, int number, int percentDiscount) {
        super(name, price, number);
        this.percentDiscount = percentDiscount;
    }

    public double getPercentDiscount() {
        return percentDiscount;
    }

    @Override
    public int getCost() {
        int val = super.getCost();
        if(getNumber() > MAX_NUMBER){
            val = (int)Math.round(val * (100 - percentDiscount) / 100);
        }
        return val;
    }
    @Override
    protected String configOutput() {
        return super.configOutput() + ";" + percentDiscount;
    }
}
