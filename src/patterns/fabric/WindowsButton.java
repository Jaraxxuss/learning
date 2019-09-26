package patterns.fabric;

public class WindowsButton implements Button {

    @Override
    public void onClick() {
        System.out.println("winbut");
    }

    @Override
    public void render() {
        System.out.println("winrend");
    }
}
