package by.gsu.asoilab;

public class Subject {
    private String name;
    private UniformMaterial material;
    private double volume;

    public Subject() {

    }

    public Subject(String name, UniformMaterial material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UniformMaterial getMaterial() {
        return material;
    }

    public void setMaterial(UniformMaterial material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return name + ";" + material + ";" + volume + ";" + getMass();

    }

    private double getMass() {
        return volume * material.getDensity();
    }
}
