package by.gsu.asoilab.inh2;

public class Purchase implements Comparable<Purchase>{
    private final Product product;
    private final int number;

    public Purchase(Product product, int number) {
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
        Byn temp = new Byn(product.getPrice());

        return temp.mul(number);
    }

    @Override
    public String toString() {
        return configOutput() + ";" + getCost();
    }

    @Override
    public int compareTo(Purchase purchase) {
        return purchase.getNumber() - number;
    }

    protected String configOutput(){
        return product + String.format(";%d",number);
    }
}
