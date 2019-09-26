package patterns.abstractFactory;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("WinCheckBox");
    }
}
