package patterns.abstractFactory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("WinButton");
    }
}
