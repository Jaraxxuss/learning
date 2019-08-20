package epam.part2.sorting;
import algorithms.Algoritms;
import algorithms.Algoritms.*;
import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {


    }
    public static void printDoubleArr(double[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void printFractions(double[] numerators,double[] denominators){
        printDoubleArr(numerators);
        printDoubleArr(denominators);
    }
    public static void ex1(final int index,int[] first,final int[] second){
        moveElements(index,first,second.length);
        for (int i = 0; i < second.length; i++) {
            if(i + index == first.length) return;
            first[i + index] = second[i];
        }
    }
    private static void moveElements(final int index,int[] arr,final int length){
        for (int i = arr.length; i > length + index; i--) {
            arr[i - 1] = arr[i - length - 1];
        }
    }
    public static void ex2(int[] first,final int[] second){
        for (int value : second) {
            for (int j = 0; j < first.length; j++) {
                if (value < first[j]) {
                    moveElements(j, first, 1);
                    first[j] = value;
                    break;
                }
            }
        }
    }
    public static int[] possitionsToInsert(final int[] arr, final int[] consts){
        int[] possitions = new int[consts.length];
        for (int i = 0; i < consts.length; i++) {
            possitions[i] = Algoritms.binarySearchPos(arr,consts[i],arr.length - 1) + i;
        }
        return possitions;
    }
    public static void sortFractions(double[] numerators,double[] denominators){
        double factor = 1;
        for (double denominator : denominators) {
            factor *= denominator;
        }
        System.out.println(factor);;
        for (int i = 0; i < numerators.length; i++) {
            numerators[i] *= (factor/denominators[i]);
        }
        printDoubleArr(numerators);
        for (int i = 0; i < numerators.length - 1; i++) {
            for (int j = 0; j < numerators.length - i - 1; j++) {
                if (numerators[j] > numerators[j + 1]) {
                    Algoritms.swap(numerators, j + 1);
                    Algoritms.swap(denominators, j + 1);
                }
            }
        }
        for (int i = 0; i < numerators.length; i++) {
            numerators[i] = Math.round(numerators[i] *= (denominators[i]/factor));
        }
    }
}
