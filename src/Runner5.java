import by.gsu.asoilab.Trial;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Runner5 {


    public static void main(String[] args) {
        final  int LEN = 7;
        String name = "";
        int mark1 = 0;
        int mark2 = 0;
        Trial[] trials = new Trial[LEN];
        try(Scanner sc = new Scanner(new FileReader("src\\in2.txt"))){
            for (int i = 0; i < LEN; i++) {
                name = sc.next();
                mark1 = sc.nextInt();
                mark2 = sc.nextInt();
                trials[i] = new Trial(name,mark1,mark2);
            }
            printTrials(trials);
            double [] results = averageValuesOfFTest(trials);

            for (double result : results) {
                System.out.println(result);
            }
            Trial testTrial = new Trial("testTrial",(int)results[0],(int)results[1]);
            System.out.println("testTrial is passed tests : " + testTrial.isPassed());
            setMarksToZeroIfUnpassed(trials);
            printTrials(trials);

        }
        catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
    }

    static double[] averageValuesOfFTest(Trial[] trials){
        double sum1 = 0;
        double sum2 = 0;
        for (Trial trial : trials) {
            sum1 += trial.getMark1();
            sum2 += trial.getMark2();
        }
        return  new double[]{
                trials.length != 0 ? sum1/trials.length : 0,
                trials.length != 0 ? sum2/trials.length : 0
        };
    }
    static void setMarksToZeroIfUnpassed(Trial[] trials){
        for (Trial trial : trials) {
            if(!trial.isPassed()) {
                trial.setMark1(0);
                trial.setMark2(0);
            }
        }
    }
    static void printTrials(Trial[] trials){
        for (Trial trial : trials) {
            System.out.println(trial);
        }
    }
}
