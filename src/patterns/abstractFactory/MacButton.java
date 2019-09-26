package patterns.abstractFactory;


public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacButton");
    }
}
