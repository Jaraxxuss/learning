package algorithms;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
//        showMinAndExecTime((x -> -x*x),0,6,"Fibonachi");
//        showMinAndExecTime((x -> -x*x),0,6,"Diho");
        int[][] arr = new int[][]{
                {9,4,1,8,2},
                {4,5,8,1,5},
                {4,3,3,9,9},
                {9,5,2,5,7},
                {6,2,3,3,9},
                {8,4,3,6,4}
        };
        Matrix matrix = new Matrix(arr);
        int result = matrix.SEMethod(new int[]{100,150,50,200,360,140},new int[]{160,140,280,220,200});
        System.out.println(result);

    }
    private static void showMinAndExecTime(Function function,double start,double end,String methodName){
        double min = 0;
        long last = 0;
        long beg = 0;
        switch (methodName){
            case "Fibonachi":
                beg = System.nanoTime();
                min = Algoritms.getMinByFibonachi(function,start,end);
                last = System.nanoTime();
                break;
            case "Diho":
                beg = System.nanoTime();
                min = Algoritms.getMinByDiho(function,start,end);
                last = System.nanoTime();
                break;
        }
        System.out.println("name : " + methodName + " min = " + min + " time = " + (last - beg));
    }
}

class Matrix{
    private int[][] arr;

    private void showMatrix(int[][] arr){
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public Matrix(int[][] arr) {
        this.arr = arr;
    }
    public int SEMethod(int[] kolvo,int[] potrebnost){
        int[][] arr = this.arr.clone();
        int[] b = kolvo.clone();
        int[] c = potrebnost.clone();
        int result = 0;
        while (!isAllZero(b) & !isAllZero(c)){
            System.out.println("Matrix");
            showMatrix(arr);
            System.out.println("B");
            System.out.println(Arrays.toString(b));
            System.out.println("C");
            System.out.println(Arrays.toString(c));
            int diff = b[0] - c[0];
            if(diff > 0){
                result += (c[0] * arr[0][0]);
                b[0] -= c[0];
                System.arraycopy(c,1,c,0,c.length-1);
                c[c.length - 1] = 0;
                for (int i = 0; i < arr.length; i++) {
                    System.arraycopy(arr[i],1,arr[i],0,arr[i].length - 1);
                    arr[i][arr[i].length - 1] = 0;
                }

            }
            else if(diff < 0){
                result += b[0] * arr[0][0];
                c[0] -= b[0];
                System.arraycopy(b,1,b,0,b.length-1);
                b[b.length - 1] = 0;
                for (int i = 0; i < arr.length - 1; i++) {
                    System.arraycopy(arr[i + 1],0,arr[i],0,arr[i].length);
                }
                for (int i = 0; i < arr[0].length; i++) {
                    arr[arr.length - 1][i] = 0;
                }

            }
            else {
                result += c[0] * arr[0][0];
                System.arraycopy(c,1,c,0,c.length-1);
                System.arraycopy(b,1,b,0,b.length-1);
                c[c.length - 1] = 0;
                b[b.length - 1] = 0;
                for (int i = 0; i < arr.length; i++) {
                    System.arraycopy(arr[i],1,arr[i],0,arr[i].length - 1);
                    arr[i][arr[i].length - 1] = 0;
                }
                for (int i = 0; i < arr.length - 1; i++) {
                    System.arraycopy(arr[i + 1],0,arr[i],0,arr[i].length);
                }
                for (int i = 0; i < arr[0].length; i++) {
                    arr[arr.length - 1][i] = 0;
                }
            }
        }
        return result;

    }
    public int MinMethod(int[] kolvo,int[] potrebnost) {
        int[][] arr = this.arr.clone();
        int[] b = kolvo.clone();
        int[] c = potrebnost.clone();
        int result = 0;

        return result;
    }
    private static boolean isAllZero(int[] arr){
        for (int i : arr) {
            if(i != 0){
                return false;
            }
        }
        return true;
    }
    private static int minInArray(int[] arr){
        int min = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


}