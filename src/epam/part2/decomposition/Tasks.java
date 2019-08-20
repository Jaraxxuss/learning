package epam.part2.decomposition;
import epam.part2.arrays.Task;
import org.jetbrains.annotations.NotNull;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Tasks {
    public static void main(String[] args) {
    }
    public static void printPoints(@NotNull Point[] points){
        for (Point point : points) {
            System.out.println(point);
        }
    }
    public static int nod(int value1,int value2){
        int a = value1,b = value2;
        if(value1 < value2){
            b = value1;
            a = value2;
        }
        int r1 = a % b;
        int q = a - r1;
        return r1 == 0 ? b : nod(q,r1);
    }
    public static int nok(int value1,int value2){
        return (value1 * value2) / nod(value1,value2);
    }
    public static int nodNnumbers(@NotNull int... numbers){
        int result = nod(numbers[0],numbers[1]);
        for (int i = 2; i < numbers.length; i++) {
            result = nod(result,numbers[i]);
        }
        return result;
    }
    public static double triangleSbyGeron(double a,double b,double c){
        double p = (a + b + c) / 2.0;
        return Math.sqrt((p - a) * (p - b) * (p - c) * p);
    }
    public static double hexagonSquare(int a){
        return 6 * triangleSbyGeron(a,a,a);
    }
    public static double lengthBetweenPoints(Point p1,Point p2){
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(),2) + Math.pow(p1.getY() - p2.getY(),2));
    }
    public static Point[] pointsWithMaxLengthBetweenThem(Point[] points){
        ArrayList<Point> arrayList = new ArrayList<>();
        double maxLength = -1;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if(lengthBetweenPoints(points[i],points[j]) > maxLength){
                    arrayList.clear();
                    arrayList.add(points[i]);
                    arrayList.add(points[j]);
                }
                if(lengthBetweenPoints(points[i],points[j]) == maxLength){
                    arrayList.add(points[i]);
                    arrayList.add(points[j]);
                }
            }
        }
        Point[] results = new Point[arrayList.size()];
        for (int i = 0; i < results.length; i++) {
            results[i] = arrayList.get(i);
        }
        return results;
    }
    public static int preMax(@NotNull int[] arr){
        int prev = Integer.MIN_VALUE;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                prev = max;
                max = arr[i];
            }
            else if(arr[i] > prev) prev = arr[i];
        }
        return prev != max ? prev : Integer.MIN_VALUE;
    }
    public static double square90degrees(int a, int b){
        return a * b / 2.0;
    }
    public static boolean isCoprime(int... numbers){
        return nodNnumbers(numbers) == 1;
    }
    public static BigInteger factorial(int value){
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i < value + 1; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
    public static BigInteger summFactorial1_9(){
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < 9; i += 2) {
            result = result.add(factorial(i + 1));
        }
        return result;
    }
    public static double quadrangleSquare(int x,int y,int z,int t){
        double square = square90degrees(x,y);
        square += triangleSbyGeron(z,t,Math.sqrt(x * x + y * y));
        return square;
    }
    public static int[] digitArray(final int number){
        int[] result = new int[numbersOfDigits(number)];
        int temp = number;
        for (int i = result.length - 1; i >= 0 ; i--,temp /= 10) {
            result[i] = temp % 10;
        }
        return result;
    }
    public static int numbersOfDigits(final int number){
        int temp = number;
        int result = 0;
        while (temp != 0){
            temp /= 10;
            result++;
        }
        return result;
    }
    public static int longestNumber(final int first, final int second){
        return numbersOfDigits(first) - numbersOfDigits(second);
    }
    public static int summNumbers(final int... numbers){
        int summ = 0;
        for (int number : numbers) {
            summ += number;
        }
        return summ;
    }
    public static int[] arrayWithCondition(final int N,final int K){
        Random random = new Random();
        int[] result = randomArray(1 + random.nextInt(K - 1 + 1),1,N);
        while (summNumbers(result) != K) result = randomArray(1 + random.nextInt(K - 1 + 1),1,N);
        return result;
    }
    public static int[] randomArray(int length,int start, int end){
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
                arr[i] = start + random.nextInt(end - start + 1);
        }
        return arr;
    }
    private static boolean isPrime(int p) {
        return Task.isPrime(p);
    }
    public static void printTwins(int n){
        for (int i = n; i < 2*n - 2; i++) {
            if(isPrime(i) & isPrime(i + 2)) System.out.println(i + " & " + (i + 2) + " are Twins");
        }
    }
    public static void printArmstrongNumbers(int k){
        for (int i = 1; i < k + 1; i++) {
            if((int)Math.pow(summNumbers(digitArray(i)),numbersOfDigits(i)) == i) System.out.println(i + " is Armstrong number");
        }
    }
    public static boolean isAllDigitsOdd(int[] digits){
        for (int digit : digits) {
            if (!isOdd(digit)) return false;
        }
        return true;
    }
    public static boolean isOdd(int number){
        return number % 2 == 1;
    }
    public static int summNumbersWhereAllDigitsOdd(int numbersOfDigits){
        int summ = 0;
        int last = lastInt(numbersOfDigits);
        for (int i = 1; i < last; i++) {
            if(isAllDigitsOdd(digitArray(i))) summ += i;
        }
        return summ;
    }
    public static int lastInt(int numbersOfDigits){
        int result = 1;
        int i = 0;
        while (i < numbersOfDigits) {

            i++;
            result *= 10;
        }
        return result;
    }
    public static int numberOfEvenDigitsInNumber(int number){
        int[] digits = digitArray(number);
        int count = 0;
        for (int digit : digits) {
            if (!isOdd(digit)) count++;
        }
        return count;

    }
    public static int ex17(final int number){
        int temp = number;
        int count = 0;
        while (temp != 0){
            temp -= summNumbers(digitArray(temp));
            count++;
        }
        return count;
    }
    public static void ex15(int numbersOfDigits){
        int last = lastInt(numbersOfDigits);
        for (int i = 1; i < last; i++) {
            if(isSrictlyIncreasingSequence(i)) System.out.println(i + " is strictly increasing sequence");
        }
    }
    private static boolean isSrictlyIncreasingSequence(int number) {
        int[] digits = digitArray(number);
        for (int i = 1; i < digits.length; i++) {
            if(!isDifferenceEqualsN(digits[i - 1],digits[i],1))return false;
        }
        return true;
    }
    private static boolean isDifferenceEqualsN(int a,int b,final int N){
        return b - a == N;
    }
    public static void printSummsThreeElements(int[] arr){
        for (int i = 0; i < arr.length; i += 3) {
            System.out.println(summElements(arr,i + 1,3));
        }
    }
    private static int summElements(int[] arr,final int start,final int N){
        int sum = 0;
        int end = start + N - 1;
        if(end > arr.length) end = arr.length;
        for (int i = start - 1; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }

}

class Point{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}