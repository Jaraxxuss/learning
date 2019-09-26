package by.gsu.asoilab;

public class UniformMaterial {

    private final String name;
    private final double density;

    public UniformMaterial(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    
    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return name + ";" + density;
    }
}
