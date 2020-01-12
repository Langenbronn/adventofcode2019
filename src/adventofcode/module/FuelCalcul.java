package adventofcode.module;

import adventofcode.file.read.FileReadData;

public class FuelCalcul {
    protected int fuelTotal = 0;

    public int fuelRequired(int mass) {
        int s = mass / 3;
        return (s - 2);
    }

    public int fuelRequired(String source) {
        FileReadData fRead = new FileReadData(source);
        String mass = fRead.intFile();
        while (mass != null) {
            fuelTotal = fuelTotal + fuel(Integer.parseInt(mass));
            System.out.println(Integer.parseInt(mass));
            mass = fRead.lecture();
        }
        return fuelTotal;
    }


    private int fuel(int mass) {
        int s = mass / 3;
        return (s - 2);
    }
}
