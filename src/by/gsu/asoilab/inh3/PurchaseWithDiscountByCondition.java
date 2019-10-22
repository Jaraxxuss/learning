package by.gsu.asoilab.inh3;

import java.util.Scanner;

public class PurchaseWithDiscountByCondition extends AbstractPurchase {
    private static final int MAX_NUMBER = 2;
    private final double percentDiscount;

    public PurchaseWithDiscountByCondition(Product product, int number, double percentDiscount) {
        super(product, number);
        this.percentDiscount = percentDiscount;
    }

    public PurchaseWithDiscountByCondition(Scanner scanner) {
        super(scanner);
        this.percentDiscount = scanner.nextDouble();
    }

    public double getPercentDiscount() {
        return percentDiscount;
    }

    @Override
    protected String configOutput() {
        return super.configOutput() + ";" + percentDiscount;
    }


    @Override
    protected Byn getFinalCost(Byn byn) {

        if(getNumber() > MAX_NUMBER){
           byn = byn.mul((100 - percentDiscount) / 100);
        }
        return byn;
    }
}
