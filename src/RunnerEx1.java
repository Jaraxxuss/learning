import by.gsu.asoilab.inh1.Purchase;
import by.gsu.asoilab.inh1.PurchaseWithDiscount;
import by.gsu.asoilab.inh1.PurchaseWithDiscountByCondition;

public class RunnerEx1 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Purchase[] purchases = {
                new Purchase("milk",100,1),
                new Purchase("ball", 706,25),
                new PurchaseWithDiscountByCondition("milk", 100, 3,10),
                new PurchaseWithDiscountByCondition("phone", 150030, 1, 15),
                new PurchaseWithDiscount("laptop",20990,5,5),
                new PurchaseWithDiscount("milk",100,4,3),
        };
        System.out.println("Task 2");
        printPurchases(purchases);
        System.out.println("Task 3");
        outputPurchaseWithMaxCost(purchases);
        System.out.println("Task 4");
        Purchase other = new Purchase(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2]));
        System.out.println(countEqualsPurchases(purchases,other));

    }
    public static void printPurchases(Purchase[] purchases){
        for (Purchase purchase : purchases) {
            System.out.println(purchase);
        }
    }
    public static void outputPurchaseWithMaxCost(Purchase[] purchases){
        int max =Integer.MIN_VALUE;
        int maxIndex = 0;
        int val;
        for (int i = 0; i < purchases.length; i++) {
            val = purchases[i].getCost();
            if(val > max){
                max = val;
                maxIndex = i;
            }
        }
        System.out.println(purchases[maxIndex]);
    }
    public static int countEqualsPurchases(Purchase[] purchases,Purchase other){

        int count = 0;
        for (Purchase purchase : purchases) {
            if(purchase.equals(other)){
                count++;
            }
        }
        return count;
    }

}
