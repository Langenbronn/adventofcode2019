package adventofcode.program.location;

import adventofcode.file.read.FileReadData;

import java.util.ArrayList;

public class WireLocalisation {
    private ArrayList<ArrayList<Dot>> listCoordonate = new ArrayList<ArrayList<Dot>>();
    private int x = 0;
    private int y = 0;

    public void convertWireToCoord(String source)  {
        FileReadData fRead = new FileReadData(source);
        ArrayList<ArrayList<String>>  list = new ArrayList ();
        fRead.readFileListByLine(list);
        System.out.println("list " + list);

        listCoordonate.add(new ArrayList<Dot>());
        listOfListDot(0,x,y);
        for(String wire : list.get(0)) {
            System.out.println("wire " + wire);
            readCoord(0, wire);
        }
        System.out.println("listCoordonate " + listCoordonate);
    }

    public void readCoord (int num, String wire){
        switch (wire.charAt(0)) {
            case 'U':
                y = y + Integer.parseInt(wire.substring(1));
                listOfListDot(num,x,y);
                break;
            case 'D':
                y = y - Integer.parseInt(wire.substring(1));
                listOfListDot(num,x,y);
                break;
            case 'R':
                x = x + Integer.parseInt(wire.substring(1));
                listOfListDot(num,x,y);
                break;
            case 'L':
                x = x - Integer.parseInt(wire.substring(1));
                listOfListDot(num,x,y);
                break;
            default:
                System.out.println("error");
                break;
        }
    }

    private void listOfListDot(int num, int x, int y) {
        listCoordonate.get(num).add((new Dot (x,y)));
    }
}
