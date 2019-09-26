package patterns.fabric;

public class HtmlButton implements Button {
    @Override
    public void onClick() {
        System.out.println("htmlButton");
    }

    @Override
    public void render() {
        System.out.println("htmlrend");
    }
}
