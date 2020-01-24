
import adventofcode.file.read.FileReadData;
import adventofcode.program.alarm.Intcode;
import adventofcode.program.location.WireLocalisation;
import adventofcode.program.secure.Password;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
//        FuelCalcul fuelCalcul = new FuelCalcul();
//        fuelCalcul.fuelRequired("modules");
//        System.out.println("Total fuel : "+fuelCalcul.getFuelTotal());
//        Intcode intcode = new Intcode();
//        System.out.println(intcode.intcodeList("programAlarm"));
//        WireLocalisation wire = new WireLocalisation();
//        wire.convertWireToCoord("wires");

//        168630-718098
        ArrayList<Integer> puzzle = new ArrayList<Integer>();
        puzzle.add(1);
        puzzle.add(6);
        puzzle.add(8);
        puzzle.add(3);
        puzzle.add(0);
        puzzle.add(7);
        puzzle.add(1);
        puzzle.add(8);
        puzzle.add(0);
        puzzle.add(9);
        puzzle.add(8);
        Password password = new Password();
        password.passwordPossibility(puzzle);

//        FileReadData frd = new FileReadData("wires");
//        frd.readFileListByLine();

    }
}
