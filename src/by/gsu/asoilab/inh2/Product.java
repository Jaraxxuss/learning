package by.gsu.asoilab.inh2;

public class Product {
    private final String name;
    private final Byn price;

    public Product(String name, Byn price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Byn getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return name + ";" + price;
    }

}
