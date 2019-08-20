package ch3.ex1;

public interface Measurable {
    double getMeasure();
    static double average(Measurable[] objects){
        double avg = 0;
        for(Measurable object : objects){
            avg += object.getMeasure();
        }
        return avg / objects.length;

    }
    static Measurable largest(Measurable[] objects){
        Measurable max = objects[1];
        for(Measurable object : objects){
            if(max.getMeasure() < object.getMeasure()){
                max = object;
            }
        }
        return max;
    }
}
