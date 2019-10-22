package by.gsu.asoilab.inh3;

import java.util.Scanner;

public abstract class AbstractPurchase implements Comparable<AbstractPurchase> {
    private final Product product;
    private final int number;

    public AbstractPurchase(Scanner scanner) {
        this.product = new Product(scanner.next(),new Byn(scanner.nextInt()));
        this.number = scanner.nextInt();
    }

    public AbstractPurchase(Product product, int number) {
        this.product = product;
        this.number = number;
    }

    public Product getProduct() {
        return product;
    }

    public int getNumber() {
        return number;
    }

    public Byn getCost(){
        Byn baseCost = product.getPrice().mul(number);
        baseCost = getFinalCost(baseCost);
        return baseCost.roundDownToOne();
    }

    @Override
    public String toString() {
        return configOutput() + ";" + getCost();
    }

    @Override
    public int compareTo(AbstractPurchase purchase) {
        return purchase.getCost().compareTo(getCost());
    }

    protected String configOutput() {
        return product + String.format(";%d", number);
    }
    protected abstract Byn getFinalCost(Byn byn);
}