import by.gsu.asoilab.Product;
import by.gsu.asoilab.Purchase;

public class RunnerVasya {
    public static void main(String[] args) {
        Product book = new Product("book",7);
        Purchase purchase1 = new Purchase(book,5);
        Purchase purchase2 = new Purchase(book,12);
        System.out.println(purchase1 + "\n" + purchase2);
        Product magazine = new Product("magazine",10);
        purchase2.setProduct(magazine);
        System.out.println("Cost : " + purchase2.getCost());
        purchase1.setProduct(magazine);
        purchase2.setProduct(book);
        System.out.println(purchase1 + "\n" + purchase2);

    }
}
