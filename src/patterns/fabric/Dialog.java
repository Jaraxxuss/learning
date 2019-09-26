package patterns.fabric;

public abstract class Dialog {
    public void render(){
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
    public abstract Button createButton();
}
