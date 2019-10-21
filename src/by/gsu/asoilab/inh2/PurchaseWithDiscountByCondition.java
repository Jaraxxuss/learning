package by.gsu.asoilab.inh2;

public class PurchaseWithDiscountByCondition extends Purchase {
    private static final int MAX_NUMBER = 2;
    private final double percentDiscount;

    public PurchaseWithDiscountByCondition(Product product, int number, double percentDiscount) {
        super(product, number);
        this.percentDiscount = percentDiscount;
    }

    public double getPercentDiscount() {
        return percentDiscount;
    }

    @Override
    protected String configOutput() {
        return super.configOutput() + ";" + percentDiscount;
    }

    @Override
    public Byn getCost() {
        Byn val = super.getCost();
        if(getNumber() > MAX_NUMBER){
            val.mul((100 - percentDiscount) / 100);
        }
        return val;
    }
}
