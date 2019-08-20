package epam.part2.massarrays;
import algorithms.Algoritms;
import org.jetbrains.annotations.NotNull;
import epam.part2.arrays.Task;

import java.util.*;

public class Tasks2 {
    public static void main(String[] args) {
        //int[][] arr = matrixWithCondition2(4);
        printMatrix(getMagicSquare(3));
    }
    private static void printMatrix(@NotNull final int[][] arr){
        Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
    }
    private static void testTask8(int[][] arr){
        Scanner  scanner = new Scanner(System.in);
        System.out.print("input numbers of first collumn ");
        int col1 = scanner.nextInt();
        System.out.print("input numbers of second collumn ");
        int col2 = scanner.nextInt();
        swapCollumsInArray(col1,col2,arr);
        printMatrix(arr);
    }
    public static void showMatrixWithCondition(@NotNull final int[][] arr){ //task1
        for(int j = 0; j < arr[0].length; j += 2) {
            if(arr[0][j] > arr[arr.length - 1][j]) {
                for (int[] ints : arr) {
                    System.out.println(ints[j]);
                }
            }
        }
    }
    public static void showElementsonDiagonal(@NotNull final int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i]);
        }
    }
    public static void showElementsPK(final int k, final int p, @NotNull final int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[k][i - 1]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i - 1][p]);
        }
        System.out.println();
    }
    public static int[][] matrixWithCondition1(final int n){
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < n; j++) {
                    arr[i][j] = j + 1;
                }
            }
            else{
                arr[i] = reverse(arr[i - 1]);
            }
        }
        return arr;

    }
    public static int[][] matrixWithCondition2(final int n){
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                arr[i][j] = i + 1;
            }
        }
        return arr;
    }
    public static int[][] matrixWithCondition3(final int n){
        int[][] arr = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i; j++) {
                arr[i][j] = arr[n - i - 1][j] = 1;
            }
        }
        return arr;
    }
    private static int[] reverse(final int[] arr){
        int[] temp = Arrays.copyOf(arr,arr.length);
        for (int i = 0; i < arr.length / 2; i++) {
            Algoritms.swap(temp,i,temp.length - i - 1);
        }
        return temp;
    }
    public static int numbersOfPosElements(@NotNull final double[][] arr){
        int num = 0;
        for (double[] doubles : arr) {
            for (double aDouble : doubles) {
                if (aDouble > 0) num++;
            }
        }
        return num;
    }
    public static double[][] matrixWithCondition4(final int n){
        double[][] arr = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                arr[i][j] = Math.sin(((Math.pow(i + 1, 2) - Math.pow(j + 1, 2)) / 2));
            }
        }
        return arr;
    }
    private static void swapCollumsInArray(final int col1, final int col2, @NotNull int[][] arr){
        for (int[] ints : arr) {
            Algoritms.swap(ints, col1 - 1, col2 - 1);
        }
    }
    public static int maxSummInCollumn(@NotNull final int[][] arr){
        int maxSumm = 0;
        for (int i = 0; i < arr[0].length; i++) {
            int tempSumm = 0;
            for (int[] ints : arr) {
                tempSumm += ints[i];
            }
            if(tempSumm > maxSumm){
                maxSumm = tempSumm;
            }
        }
        return maxSumm;
    }
    public static String posElemetsAtDiagonal(@NotNull final  int[][] arr){
        StringBuilder posElements = new StringBuilder("posElements: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0)
                posElements.append(arr[i][i]).append(" ");
        }
        return posElements.toString();
    }
    public static int[][] randomArray(final int N, final int M, final int start, final int end){
        int[][] arr = new int[N][M];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = start + random.nextInt(end - start + 1);
            }
        }
        return arr;
    }
    public static int[][] randomArrayWithZeroesAndOnes(final int N,final  int M){
        int[][] arr = new int[N][M];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < M; i++) {
            int numbersOfOnes = 0;
            int numbersOfZeroes = 0;
            for (int j = 0; j < N; j++) {

                arr[j][i] = random.nextInt(2);
                if(arr[j][i] == 0)numbersOfZeroes++;
                else numbersOfOnes++;
                if(numbersOfOnes > (i + 1)){
                    arr[j][i] = 0;
                    numbersOfOnes--;
                    numbersOfZeroes++;
                }
                if(numbersOfZeroes > (N - (i + 1))){
                    arr[j][i] = 1;
                    numbersOfOnes++;
                    numbersOfZeroes--;
                }
            }
        }
        return arr;
    }
    private static String countDigit(@NotNull int[][] arr, int digit){
        StringBuilder string = new StringBuilder("lines: ");
        for (int i = 0; i < arr.length; i++) {
            if(Task.numbersOfTheSameElements(arr[i],digit) > 2){
                string.append(i + 1).append(" ");
            }
        }
        return string.toString();
    }
    private static void testTask11(){
        int[][] arr = randomArray(10,20,0,15);
        printMatrix(arr);
        System.out.println(countDigit(arr,5));
    }
    private static int max(@NotNull int[][] arr){
        int max = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max)
                    max = anInt;
            }
        }
        return max;
    }
    public  static void replaceOddsForMax(@NotNull int[][] arr){
        int max = max(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i % 2 != 0 ? 0 : 1; j < arr[i].length; j += 2) {
                arr[i][j] = max;
            }
        }
    }
    private static boolean isMagicSquare(@NotNull int[][] arr){
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < arr.length; ++i)
        {
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length - i - 1];
        }
        if (sum1 != sum2) return false;
        int sh, sv;
        for(int i = 0; i < arr.length; ++i)
        {
            sv = sh = 0;
            for(int j = 0; j < arr.length; ++j)
            {
                sv += arr[j][i];
                sh += arr[i][j];
            }
            if (sv != sum1) return false;
            if(sh != sum1) return false;
        }
        return true;
    }
    public static int[][] getMagicSquare(final int N){
        int[][] arr;
        System.out.println("Generating...");
        do{
            arr = generateArr(N,N);
        }while (!isMagicSquare(arr));
        return arr;
    }
    private static int[][] generateArr(final int N,final int M){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= N * M; i++) {
            arrayList.add(i);
        }
        int[][] arr = new int[N][M];
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int index = random.nextInt(N * M  - count++);
                arr[i][j] = arrayList.get(index);
                arrayList.remove(index);
            }
        }
        return arr;
    }
    private static void transpose(@NotNull int[][] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    private static void swapRowsInArray(final int row1, final int row2, @NotNull int[][] arr){
        int temp;
        for (int i = 0; i < arr[0].length; i++) {
            temp = arr[row1 - 1][i];
            arr[row1 - 1][i] = arr[row2 - 1][i];
            arr[row2 - 1][i] = temp;
        }
    }
    public static void matrixWithCondition12(@NotNull int[][] arr){
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 1; k < arr.length - i; k++){
                    if(arr[k][i] > arr[k - 1][i] & (i == 0 || arr[k][i - 1] == arr[k - 1][i - 1])){
                        swapRowsInArray(k + 1,k,arr);
                    }

                }
            }

        }
    }
    public static void matrixWithCondition13(@NotNull int[][] arr){
        transpose(arr);
        matrixWithCondition12(arr);
        transpose(arr);
    }
}
