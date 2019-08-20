package epam.part2.arrays;

import java.util.Arrays;

public class Task{
    public static void main(String[] args) {
    }
    public static int summOfElementsInArray(final int[] arr,final int K) {
        int sum = 0;
        for (int value : arr) {
            if (value % K == 0) sum += value;
        }
        return sum;
    }
    public static int[] newArray(final int Z,final int... arr){
        int[] newArray = arr.clone();
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i] > Z) newArray[i] = Z;
        }
        return newArray;
    }
    public static String compWithZero(final int[] arr){
        int pos = 0;
        int neg = 0;
        for (int elem : arr){
            if(elem < 0) neg++;
            if(elem > 0) pos++;
        }
        return "pos = " + pos + "\nneg = " + neg + "\nzero = " + (arr.length - pos - neg);
    }
    public static void changeArray(int... arr){
        int max = arr[0],min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max) max = i;
            if(arr[i] < min) min = i;
        }
        swap(arr,min,max);
    }
    private static void swap(int[] arr ,int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;

    }
    public static void printArrayWithCondition(int... arr){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > i) stringBuilder.append(arr[i]).append(", ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("]");
        System.out.println(stringBuilder);
    }
    public static int summ(int... arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(i + 1)) sum += arr[i];
        }
        return sum;
    }
    public static boolean isPrime(int p) {
        if (p < 2)
            return false;
        double s = Math.sqrt(p);
        for (int i = 2; i <= s; i++) {
            if (p % i == 0)
                return false;
        }
        return true;
    }
    public static int maxSummOfPairs(final int... arr){
        int sum = arr[0] + arr[arr.length - 1];
        for (int i = 1 ,ri = arr.length - 2; i < Math.round((double)arr.length / 2); i++ , ri--) {
            if(i != ri){
                if(arr[i] + arr[ri] > sum)  sum = arr[i] + arr[ri];
            }
            else{
                if(arr[i] > sum)  sum = arr[i];
            }

        }
        return sum;
    }
    public static int[] arrayWithoutMins(final int... arr){
        int minVal = min(arr);
        int numsOfMinVal = numbersOfTheSameElements(arr,minVal);
        int[] newArr = new int[arr.length - numsOfMinVal];
        int indexCounter = 0;
        for (int value : arr) {
            if (value != minVal) newArr[indexCounter++] = value;
        }
        return newArr;
    }
    public static int min(final int... arr){
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minVal) minVal = arr[i];
        }
        return minVal;
    }
    public static int numbersOfTheSameElements(int[] arr,int val){
        int numbers = 0;
        for (int value : arr) {
            if (value == val) numbers++;
        }
        return numbers;
    }
    public static int mostOftenNumberInArray(int [] arr){
        int numbers = numbersOfTheSameElements(arr,arr[0]);
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            int temp = numbersOfTheSameElements(arr,arr[i]);
            if(temp > numbers){
                numbers = temp;
                index = i;
            }
            if(temp == numbers){
                if(arr[i] > arr[index]){
                    index = i;
                }
            }
        }
        return arr[index];
    }
    public static void squeezeArray(int[] arr){
        for (int i = 1; i < arr.length / 2 + 1; i++) {
            deleteAtAndReplaceWithZero(i + 1,arr);
        }
    }
    public static void deleteAtAndReplaceWithZero(int elem,int[] arr){
        for (int i = elem - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }
}
