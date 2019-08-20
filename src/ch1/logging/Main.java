package ch1.logging;

import java.util.Formatter;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
    ClassA classA = new ClassA();
    classA.test(1,0);
    }
}

class ClassA{
    private static Logger LOGGER = Logger.getLogger(ClassA.class.getName());
    public void test(int a,int b){
        LOGGER.info("just enteredt to method test with args " + a + b);
        XMLFormatter xmlFormatter = new XMLFormatter();
        Handler handler = new ConsoleHandler();
        handler.setFormatter(xmlFormatter);
        //LOGGER.setUseParentHandlers(false);
        LOGGER.addHandler(handler);
        LOGGER.setLevel(Level.ALL);

        try{
            double result = a/b;
            System.out.println(result);
        }
        catch (RuntimeException e) {
            LOGGER.log(Level.WARNING,"hallo are u aut?! ({0} / {1})",new Object[]{a,b});

        }

    }
}
class ClassB{
    private static Logger LOGGER = Logger.getLogger(ClassA.class.getName());
}