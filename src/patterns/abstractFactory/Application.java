package patterns.abstractFactory;

public class Application {
    private final GuiFactory factory;
    private Button button;
    private CheckBox checkBox;
    public Application(GuiFactory factory) {
        this.factory = factory;
    }
    public void createUI(){
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }
    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
