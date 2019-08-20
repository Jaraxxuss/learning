package epam.part1.linearprograms;

public class Tasks {
    public static void main(String[] args) {
        System.out.println(parseTime(time(3599)));
    }
    private static double resultOfExpresion1(int a,int b,int c){
        return ((double)(a - 3) * b / 2) + c;
    }
    private static double resultOfExpresion2(double a,double b,double c){
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
    private static double resultOfExpresion3(double x,double y){
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }
    private static double resultOfExpresion4(final double R){
        return Math.round((R - (int)R) * 1000) +((int)R)/((double)1000);
    }
    private static int[] time(final int sec){
        int[] arr = new int[3];
        int seconds = sec;
        arr[0] = seconds / 3600;
        arr[1] = (seconds %= 3600) / 60;
        arr[2] = seconds % 60;
        return arr;
    }
    private static String parseTime(int[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        if(arr[0] < 10) stringBuilder.append("0");
        stringBuilder.append(arr[0]);
        stringBuilder.append("h");
        if(arr[1] < 10) stringBuilder.append("0");
        stringBuilder.append(arr[1]);
        stringBuilder.append("m");
        if(arr[2] < 10) stringBuilder.append("0");
        stringBuilder.append(arr[2]);
        stringBuilder.append("s");
        return stringBuilder.toString();
    }

}

