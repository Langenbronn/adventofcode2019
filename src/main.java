
import adventofcode.file.read.FileReadData;
import adventofcode.program.alarm.Intcode;
import adventofcode.program.location.WireLocalisation;

public class main {
    public static void main(String[] args) {
//        FuelCalcul fuelCalcul = new FuelCalcul();
//        fuelCalcul.fuelRequired("modules");
//        System.out.println("Total fuel : "+fuelCalcul.getFuelTotal());
//        Intcode intcode = new Intcode();
//        System.out.println(intcode.intcodeList("programAlarm"));
        WireLocalisation wire = new WireLocalisation();
        wire.convertWireToCoord("wires");

//        FileReadData frd = new FileReadData("wires");
//        frd.readFileListByLine();

    }
}
