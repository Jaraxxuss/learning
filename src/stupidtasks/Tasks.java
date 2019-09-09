package stupidtasks;


class Runner {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double step = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
        if (n < 0) n = 1;
        System.out.println("startValue      = " + a);
        System.out.println("numbersOfValues = " + n);
        System.out.println("step            = " + step + '\n');
        System.out.println("x   f(x)");
        System.out.println("--------");
        double temp = a;
        for (int i = 0; i < n; i++, temp += step) {
            System.out.println(temp + "\t" + (Math.pow(temp, 1 / 3.0) + Math.cos(temp * 0.5)));
        }
    }
}

class Runner2 {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
        if (n < 0) n = 1;
        if (b < a) {
            double temp = a;
            a = b;
            b = temp;
        }
        System.out.println("segment [" + a + "; " + b + "]");
        System.out.println("numbersOfValues = " + n + '\n');
        System.out.println("x   f(x)");
        System.out.println("--------");
        double temp = a;
        double step = (b - a) / (n - 1);
        for (int i = 0; i < n; i++, temp += step) {
            System.out.println(temp + " = " + (Math.pow(temp, 2) + (Math.pow(Math.E, -temp))));
        }
    }
}