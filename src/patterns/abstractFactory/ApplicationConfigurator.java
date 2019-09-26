package patterns.abstractFactory;

public class ApplicationConfigurator {
    public static void main(String[] args) throws Exception {
        String osName = "Mac";
        GuiFactory factory;
        if (osName == "Windows")
            factory = new WinFactory();
        else if (osName == "Mac")
            factory = new MacFactory();
        else
            throw new Exception("Error! Unknown operating system.");
        Application application = new Application(factory);
        application.createUI();
        application.paint();
    }
}
