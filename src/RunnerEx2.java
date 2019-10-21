import by.gsu.asoilab.inh2.*;

import java.util.Arrays;

public class RunnerEx2 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Purchase[] purchases = {
                new Purchase(new Product("milk",new Byn(200)), 2),
                new Purchase(new Product("ball",new Byn(706)),25),
                new PurchaseWithDiscountByCondition(new Product("milk",new Byn(100)),3,10),
                new PurchaseWithDiscountByCondition(new Product("phone",new Byn(15030)),1,15),
                new PurchaseWithDiscount(new Product("laptop",new Byn(20990)),9,new Byn(9)),
                new PurchaseWithDiscount(new Product("milk",new Byn(100)),4,new Byn(3)),
        };
        System.out.println("Task 2");
        printPurchases(purchases);
        System.out.println("Task 3");
        Arrays.sort(purchases);
        System.out.println("Task 4");
        printPurchases(purchases);
        System.out.println("Task 5");
        Purchase test = new Purchase(new Product("",new Byn(0)),5);
        try {
            System.out.println(purchases[Arrays.binarySearch(purchases,test)]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Not Founded");
        }

    }
    public static void printPurchases(Purchase[] purchases){
        for (Purchase purchase : purchases) {
            System.out.println(purchase);
        }
    }

}
