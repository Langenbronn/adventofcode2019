package adventofcode.program.location;

import adventofcode.file.read.FileReadData;

import java.util.ArrayList;

public class WireLocalisation {
    private ArrayList<Dot> listCoordonate = new ArrayList();
    private int x = 0;
    private int y = 0;

    public void convertWireToCoord(String source)  {
        FileReadData fRead = new FileReadData(source);
        ArrayList<String> list = new ArrayList<String>();
        fRead.readFileList(list);
        String mass = fRead.intFile();
        System.out.println("mass " + mass);
//        System.out.println("list " + list);
//        listCoordonate.add(new Dot (x,y));
//        for(String wire : list) {
//            System.out.println("wire " + wire);
//            readCoord(wire);
//        }
//        System.out.println("listCoordonate " + listCoordonate);
    }

    public void readCoord (String wire){
        switch (wire.charAt(0)) {
            case 'U':
                y = y + Integer.parseInt(wire.substring(1));
                listCoordonate.add(new Dot (x,y));
                break;
            case 'D':
                y = y - Integer.parseInt(wire.substring(1));
                listCoordonate.add(new Dot (x,y));
                break;
            case 'R':
                x = x + Integer.parseInt(wire.substring(1));
                listCoordonate.add(new Dot (x,y));
                break;
            case 'L':
                x = x - Integer.parseInt(wire.substring(1));
                listCoordonate.add(new Dot (x,y));
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
