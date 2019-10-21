package by.gsu.asoilab.inh1;

public class PurchaseWithDiscount extends Purchase {
    private final int discount;

    public PurchaseWithDiscount(String name, int price, int number, int discount) {
        super(name, price, number);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public int getCost() {
        return (getPrice() - discount) * getNumber();
    }

    @Override
    protected String configOutput() {
        return super.configOutput() + ";" + convertToFinancialFormat(discount);
    }
}
