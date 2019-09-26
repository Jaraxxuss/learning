package by.gsu.asoilab;

public class Purchase {
    private Product product;
    private int number;
    public void setProduct(Product product) {
        this.product = product;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public Product getProduct() {
        return product;
    }

    public int getNumber() {
        return number;
    }

    public Purchase(Product product, int number) {
        this.product = product;
        this.number = number;
    }

    @Override
    public String toString() {
        return product + ";" + number + ";" + getCost();
    }
    public double getCost(){
        return product.getPrice() * number;
    }
}
