package by.gsu.asoilab.inh3;

import java.util.Scanner;

public class PurchaseWithDiscount extends AbstractPurchase {
    private final Byn discount;

    public PurchaseWithDiscount(Scanner scanner) {
        super(scanner);
        this.discount = new Byn(scanner);
    }

    public PurchaseWithDiscount(Product product, int number, Byn discount) {
        super(product, number);
        this.discount = discount;
    }

    public PurchaseWithDiscount(String name,int price, int number, int discount) {
        super(new Product(name,new Byn(price)), number);
        this.discount = new Byn(discount);
    }

    public Byn getDiscount() {
        return discount;
    }


    @Override
    protected Byn getFinalCost(Byn byn) {
        return byn.sub(discount.mul(getNumber()));
    }

    @Override
    protected String configOutput() {
        return super.configOutput() + ";" + discount;
    }
}
