package by.gsu.asoilab.inh1;

import java.util.Objects;

public class Purchase {
    private final String name;
    private final int price;
    private final int number;

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Purchase(String name, int price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Purchase)) return false;
        Purchase purchase = (Purchase) o;
        return price == purchase.price &&
                Objects.equals(name, purchase.name);
    }

    @Override
    public String toString() {
        return configOutput() + ";" + convertToFinancialFormat(getCost());
    }
    public int getCost(){
        return price * number;
    }
    public static String convertToFinancialFormat(int val){
        return (val / 100) + "." + (val % 100 / 10) + (val % 10);
    }
    protected String configOutput(){
        return String.format("%s;%s;%d",name,convertToFinancialFormat(price),number);
    }
}
