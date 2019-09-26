package epam.part4.agregandcomp.t3;

public class Runner {
    public static void main(String[] args) {
        City city1 = new City("Gomel");
        City city2 = new City("Rechica");
        District district = new District("Gomelskii",new String[]{city1.getName(),city2.getName()});
    }
}
