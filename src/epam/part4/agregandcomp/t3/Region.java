package epam.part4.agregandcomp.t3;

public class Region {
    private District[] districts;
    private String name;
    public District[] getDistricts() {
        return districts;
    }

    public String getName() {
        return name;
    }

    public Region(String name) {
        this.name = name;
    }
}
