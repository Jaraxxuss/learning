package by.gsu.asoilab.inh2;

public class PurchaseWithDiscount extends Purchase {
    private final Byn discount;

    public PurchaseWithDiscount(Product product, int number, Byn discount) {
        super(product, number);
        this.discount = discount;
    }

    public Byn getDiscount() {
        return discount;
    }

    @Override
    public Byn getCost() {
        Byn temp = new Byn(getProduct().getPrice());
        return (temp.sub(discount).mul(getNumber()));
    }

    @Override
    protected String configOutput() {
        return super.configOutput() + ";" + discount;
    }
}
