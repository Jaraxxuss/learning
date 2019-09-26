import by.gsu.asoilab.DensityCollection;
import by.gsu.asoilab.Subject;
import by.gsu.asoilab.UniformMaterial;

public class Runner2 {
    public static void main(String[] args) {
        UniformMaterial steel = DensityCollection.STEEL_DENSITY;
        UniformMaterial copper = DensityCollection.COPPER_DENSITY;

        Subject wire = new Subject("wire",steel , 0.03);
        System.out.println(wire);
        wire.setMaterial(copper);
        System.out.println(wire);
        wire.setMaterial(steel);
        System.out.println(wire);

    }
}
