package adventofcode.module;

import adventofcode.file.read.FileReadData;

public class FuelCalcul {
    protected int fuelTotal = 0;

    public void setFuelTotal(int fuelTotal) {
        this.fuelTotal = fuelTotal;
    }

    public int getFuelTotal() {
        return fuelTotal;
    }

    public void fuelRequired(String source) {
        FileReadData fRead = new FileReadData(source);
        String mass = fRead.intFile();
        int number = 0;
        while (mass != null) {
            number++;
            setFuelTotal(getFuelTotal() +  fuel(Integer.parseInt(mass)));
            System.out.println("module "+ number +" : "+Integer.parseInt(mass));
            mass = fRead.lecture();
        }
        fRead.closeFile();
    }

    private int fuel(int mass) {
        int s = mass / 3;
        return (s - 2);
    }
}
