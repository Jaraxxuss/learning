package epam.part4.agregandcomp.t3;

public class District {
    String name;
    private City[] cities;

    public District(String name,String[] names) {
        this.name = name;
        cities = new City[names.length];
        for (int i = 0; i < cities.length; i++) {
            cities[i] = new City(names[i]);
        }
    }

    public City[] getCities() {
        return cities;
    }
}
