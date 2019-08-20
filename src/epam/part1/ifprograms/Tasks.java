package epam.part1.ifprograms;

public class Tasks {

    public static void main(String[] args) {
    }
    private static class Brick{
        private final int  x;
        private final int y;
        private final int z;
        Brick(final int x,final int y,final int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public int getZ() {
            return z;
        }

        public int getY() {
            return y;
        }

        public int getX() {
            return x;
        }
    }
    private static boolean isTriangle(final int A,final int B){
        return A + B < 180;
    }
    private static boolean isSquareTriangle(final int A,final int B){
        if(!isTriangle(A,B)) return false;
        if(A + B == 90) return true;
        if(A == 90) return true;
        return B == 90;
    }
    private static int max(final int A,final int B){
        return A < B ? B : A;
    }
    private static int min(final int A,final int B){
        return A < B ? A : B;
    }
    private static void testTask2(final int A,final int B,final int C,final int D){
        System.out.println(max(min(A,B),min(C,D)));
    }
    private static boolean isPossible(Brick brick,final int A,final int B){
        if ((brick.x * brick.y) <= A * B) if ((brick.x + brick.y) * 2 <= (A + B) * 2) return true;
        if ((brick.x * brick.z) <= A * B) if ((brick.x + brick.z) * 2 <= (A + B) * 2) return true;
        if ((brick.z * brick.y) <= A * B) return (brick.z + brick.y) * 2 <= (A + B) * 2;
        return false;
    }
    private static double valueOfFunction(double x){
        if(x <= 3) return (x - 3) * (x - 3);
        return 1 / (double)(x * x + 6);
    }



}
