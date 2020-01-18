
import adventofcode.program.location.WireLocalisation;

public class main {
    public static void main(String[] args) {
//        FuelCalcul fuelCalcul = new FuelCalcul();
//        fuelCalcul.fuelRequired("modules");
//        System.out.println("Total fuel : "+fuelCalcul.getFuelTotal());

//        Intcode intcode = new Intcode();
//        intcode.intcodeList("programAlarm");

        WireLocalisation wl = new WireLocalisation();
        wl.convertWireToCoord("wires");

    }
}
