package ch3.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("hii");
        strings.add("hi");
        strings.add("h");
        printArr(strings);
        luckySort(strings, Comparator.comparingInt(String::length));
        printArr(strings);
    }
    public static void luckySort(ArrayList<String> strings, Comparator<String> comparator){

        ArrayList<String> temp = (ArrayList<String>) strings.clone();
        temp.sort(comparator);
        do{
            Collections.shuffle(strings);
        }while (!strings.equals(temp));


    }
    public static void printArr(ArrayList<String> strings){
        for (String string : strings){
            System.out.println(string);
        }
    }
}
