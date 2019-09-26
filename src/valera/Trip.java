package valera;

public class Trip {
    private final static int dnevnirasxod = 10000;
    private int dengi;
    private String name;
    private int kolvodney;

    Trip() {

    }

    public Trip(int dengi, String name, int kolvodney) {
        this.dengi = dengi;
        this.name = name;
        this.kolvodney = kolvodney;
    }

    public int getDengi() {
        return dengi;
    }

    public void setDengi(int dengi) {
        this.dengi = dengi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKolvodney() {
        return kolvodney;
    }

    public void setKolvodney(int kolvodney) {
        this.kolvodney = kolvodney;
    }

    @Override
    public String toString() {
        return name + ";" + parse(dengi) + ";" + kolvodney + ";" + parse(getTotal());
    }

    private int getTotal() {
        return dnevnirasxod * kolvodney + dengi;
    }

    private static String parse(int value) {
        return String.format("%d.%02d", value / 100, value % 100);

    }

    public void show() {
        System.out.println(parse(dnevnirasxod));
        System.out.println(parse(dengi));
        System.out.println(kolvodney);
        System.out.println(name);
        System.out.println(parse(getTotal()));
        ;
    }


}
