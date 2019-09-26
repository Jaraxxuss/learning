package patterns.fabric;

public class App {
    Dialog dialog;
    public void init(String osName) throws Exception {
        if (osName == "Windows")
            dialog = new WindowDialog();
        else if (osName == "Web")
                dialog = new WebDialog();
        else
            throw new Exception("Error! Unknown operating system.");
    }
}
