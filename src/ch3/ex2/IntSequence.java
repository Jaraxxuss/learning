package ch3.ex2;

public interface IntSequence {
    boolean hasNext();
    int next();
    static IntSequence of(int... ints){
        class temp implements IntSequence{
            private int[] nums;
            int cur = 0;
            temp(){
                nums = new int[ints.length];
                for (int i = 0; i < ints.length; i++){
                    nums[i] = ints[i];
                }

            }
            @Override
            public boolean hasNext() {
                return cur < nums.length;
            }

            @Override
            public int next() {
                return nums[cur++];
            }
        }
        return new temp();

    }
    static IntSequence constant(int num){
        return new IntSequence() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return num;
            }
        };
    }
}
