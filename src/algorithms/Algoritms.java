package algorithms;

import org.jetbrains.annotations.NotNull;


public class Algoritms {
    private static final double REDUCTION_FACTOR = 1.2473309;
    private static final double FIBONACHI_FACTOR = 1.618;

    public static void main(String[] args) {
        int[] arr = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
        myInsertionSort_2(arr);
        printArr(arr);
    }

    public static void myBubbleSort(@NotNull int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j);
            }
        }
    }

    public static void swap(@NotNull int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = temp;

    }

    public static void swap(@NotNull double[] arr, int i) {
        double temp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = temp;

    }

    public static void swap(@NotNull int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;

    }

    public static void printArr(@NotNull int[] arr) {
        for (int value : arr) {
            System.out.print(value);
        }
        System.out.println();
    }

    public static void myShuffleSort(@NotNull int[] arr) {
        for (int i = 1; i < arr.length / 2; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j);
            }
            for (int j = arr.length - i; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j);
            }
        }
    }

    public static void myShuffleSort_2(@NotNull int[] arr) {
        int leftMark = 1;
        int rightMark = arr.length - 1;
        while (leftMark <= rightMark) {
            for (int i = rightMark; i >= leftMark; i--) {
                if (arr[i] < arr[i - 1])
                    swap(arr, i);
            }
            leftMark++;
            for (int i = leftMark; i <= rightMark; i++) {
                if (arr[i] < arr[i - 1])
                    swap(arr, i);
            }
            rightMark++;

        }
    }

    public static void myOddEvenSort(@NotNull int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = (i % 2) + 1; j < arr.length; j += 2) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j);
            }

        }
    }

    public static void myCombSort(@NotNull int[] arr) {
        int diff = arr.length;
        boolean swapped = true;
        while (diff > 1 || swapped) {
            if (diff > 1)
                diff = (int) (diff / REDUCTION_FACTOR);
            swapped = false;
            for (int i = 0; i < arr.length - diff; i += diff) {
                if (arr[i] > arr[i + diff]) {
                    swap(arr, i, i + diff);
                    swapped = true;
                }
            }

        }
    }

    public static void mySelectonSort(@NotNull int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = 1; j < arr.length - i + 1; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            swap(arr, max, arr.length - i);

        }

    }

    public static void myDoubleSelectonSort(@NotNull int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = 0;
            int min = 0;
            for (int j = i; j < arr.length - i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
                if (arr[j] < arr[min]) {/*DODELAT*/
                    min = j;
                }

            }
            swap(arr, max, arr.length - i - 1);
            swap(arr, min, i);

        }

    }

    public static void myInsertionnSort(@NotNull int[] arr) {
        int start;
        for (int i = 1; i < arr.length; i++) {
            start = binarySearchPos(arr, arr[i], i);
            moveSwap(arr, start, i);
        }
    }

    public static int binarySearch(@NotNull int[] arr, int key) {
        int left = 0;
        int rigth = arr.length - 1;
        while (left <= rigth) {
            int mid = (left + rigth) / 2;
            if (key == arr[mid]) return mid + 1;
            if (key < arr[mid]) {
                rigth = mid - 1;
            }
            if (key > arr[mid]) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearchPos(@NotNull int[] arr, int key, int rhs) {
        int left = 0;
        int rigth = rhs;
        int mid = 0;
        while (left <= rigth) {
            mid = (left + rigth) / 2;
            if (key == arr[mid]) return mid + 1;
            if (key < arr[mid]) {
                rigth = mid - 1;
            }
            if (key > arr[mid]) {
                left = mid + 1;
            }
        }
        if (key < arr[mid]) return left;
        return mid + 1;
    }

    public static void moveSwap(@NotNull int[] arr, int start, int end) {
        int tmp = arr[end];
        if (end - start >= 0) System.arraycopy(arr, start, arr, start + 1, end - start);
        arr[start] = tmp;
    }

    public static void myInsertionSort_2(int[] arr) {
        int j;
        for (int i = 1; i < arr.length; i++) {
            j = i;
            while (arr[j] < arr[j - 1]) {
                swap(arr, j--);
                if (j == 0) break;
            }
        }
    }

    public static double getMinByFibonachi(Function function, double start, double end) {
        double a = start;
        double b = end;
        final double e = 0.001;
        double x1 = b - (b - a) / FIBONACHI_FACTOR;
        double x2 = a + (b - a) / FIBONACHI_FACTOR;
        double y1 = function.result(x1);
        double y2 = function.result(x2);
        while (Math.abs(b - a) > e) {
            if (y1 <= y2) {
                b = x2;
                x2 = x1;
                x1 = b - (b - a) / FIBONACHI_FACTOR;
                y2 = y1;
                y1 = function.result(x1);
            } else {
                a = x1;
                x1 = x2;
                x2 = a + (b - a) / FIBONACHI_FACTOR;
                y1 = y2;
                y2 = function.result(x2);
            }
        }
        return Math.min(y1, y2);
    }

    public static double getMinByDiho(Function function, double start, double end) {
        final double e = 0.001;
        double a = start;
        double b = end;
        double x;
        while (Math.abs(b - a) > e) {
            x = (a + b) / 2;
            if (function.result(b) * function.result(x) > 0)
                a = x;
            else
                b = x;
        }

        return function.result((a + b) / 2);
    }
//    public static double getMinHukaJivca(Function function, double start, double end){
//
//    }
}
