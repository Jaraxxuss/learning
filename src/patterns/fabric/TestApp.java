package patterns.fabric;

public class TestApp {
    public static void main(String[] args) {
        App app = new App();
        try {
            app.init("Windows");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
