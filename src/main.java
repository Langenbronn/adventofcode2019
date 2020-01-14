
import adventofcode.file.read.FileReadData;
import adventofcode.module.FuelCalcul;
import adventofcode.program.alarm.Intcode;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
//        FuelCalcul fuelCalcul = new FuelCalcul();
//        fuelCalcul.fuelRequired("modules");
//        System.out.println("Total fuel : "+fuelCalcul.getFuelTotal());

        Intcode intcode = new Intcode();
        intcode.intcodeList("programAlarm");
    }
}
