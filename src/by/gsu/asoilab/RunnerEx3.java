package by.gsu.asoilab;

import by.gsu.asoilab.inh3.*;
import by.gsu.asoilab.inh3.Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class RunnerEx3 {
    public static void main(String[] args) {
        //1
        AbstractPurchase[] purchases = new AbstractPurchase[6];
        //2
        try(FileInputStream fis = new FileInputStream("src\\in.txt")){
            Scanner scanner = new Scanner(fis);
            for (int i = 0; i < purchases.length; i++) {
                int mode = scanner.nextInt();
                switch (mode){
                    case 1:
                        purchases[i] = new PurchaseWithDiscount(scanner);
                        break;
                    case 2:
                        purchases[i] = new PurchaseWithDiscountByCondition(scanner);
                        break;
                    case 3:
                        purchases[i] = new PurchaseWithTransportExpenses(scanner);
                        break;
                }
            }
            //3
            printPurchases(purchases);
            //4
            Arrays.sort(purchases);
            //5
            System.out.println();
            printPurchases(purchases);
            //6
            System.out.println("Minimal cost = " + purchases[purchases.length - 1].getCost().roundDownToOne());
            //7
            int index = Arrays.binarySearch(purchases,new PurchaseWithDiscount(null,50,10,0));
            if(index > 0){
                System.out.println(purchases[index]);
            }
            else {
                System.out.println("Not Founded");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void printPurchases(AbstractPurchase[] purchases){
        for (AbstractPurchase purchase : purchases) {
            System.out.println(purchase);
        }
    }
}
