
import adventofcode.module.FuelCalcul;

public class main {
    public static void main(String[] args) {
        FuelCalcul fuelCalcul = new FuelCalcul();
        fuelCalcul.fuelRequired("modules");
        System.out.println("Total fuel : "+fuelCalcul.getFuelTotal());
    }
}
