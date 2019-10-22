package by.gsu.asoilab.inh3;

import java.util.Scanner;

public class PurchaseWithTransportExpenses extends AbstractPurchase {
    private final Byn trasportExpenses;

    public PurchaseWithTransportExpenses(Product product, int number, Byn trasportExpenses) {
        super(product, number);
        this.trasportExpenses = trasportExpenses;
    }

    public PurchaseWithTransportExpenses(Scanner scanner) {
        super(scanner);
        this.trasportExpenses = new Byn(scanner);
    }

    public Byn getTrasportExpenses() {
        return trasportExpenses;
    }

    @Override
    protected String configOutput() {
        return super.configOutput() + ";" + trasportExpenses;
    }

    @Override
    protected Byn getFinalCost(Byn byn) {
        return byn.add(trasportExpenses);
    }
}
