import by.gsu.asoilab.*;

public class RunnerEx0 {
    public static void main(String[] args) {
        String name = args[0];
        Trial[] trials = {
                new Trial("Valera",25,99),
                new Trial("Evgeniy",80,55),
                new Trial("Timofei", 50,86),
                new StrongTrial("Aleksey", 90,80),
                new StrongTrial("Timofei",60,60),
                new LiteTrial("Artem",50,50),
                new LiteTrial("Sasha",70,70),
                new ExtraTrial("Maxim",80,8,70),
                new ExtraTrial("Valera",50,50,50)
        };
        //2
        System.out.println("Task2");
        Utils.printTrials(trials);
        //3
        System.out.println("Task3");
        outputArrayWithTheAvgVal(trials);
        //4
        System.out.println("Task4");
        clearMarksIfFailed(trials);
        //5
        System.out.println("Task5");
        Utils.printTrials(trials);
        //6
        System.out.println("Task6");
        outputSuperClassTrials(name,trials);
    }

    public static void outputArrayWithTheAvgVal(Trial[] trials) {
        int sum;
        for (Trial trial : trials) {
            if (trial.avgSum() > Trial.PASS_MARK) {
                System.out.println(trial);
            }
        }
    }

    public static void clearMarksIfFailed(Trial[] trials) {
        for (Trial trial : trials) {
            if(!trial.isPassed()) {
                trial.setMarksToZero();
            }

        }
    }
    public static void outputSuperClassTrials(String string, Trial[] trials){
        for (Trial trial : trials) {
            if(string.equals(trial.getName()) && !(trial instanceof ExtraTrial) && !(trial instanceof LiteTrial) && !(trial instanceof StrongTrial)){
                {
                    System.out.println(trial);
                }
            }
        }
    }
}