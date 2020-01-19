package adventofcode.program.location;

import adventofcode.file.read.FileReadData;

import java.util.ArrayList;

public class WireLocalisation {
    private ArrayList<Wire> listCoordonate = new ArrayList();
    private int x = 0;
    private int y = 0;

    public void convertWireToCoord(String source) {
        FileReadData fRead = new FileReadData(source);
        ArrayList<ArrayList<String>> list = new ArrayList();
        fRead.readFileListByLine(list);
        System.out.println("list " + list);

        int num = 0;
        for (ArrayList<String> lC : list) {
            x = 0;
            y = 0;
            listCoordonate.add(new Wire(new ArrayList<Dot>()));
            listOfListDot(num, x, y);
            for (String wire : lC) {
                readCoord(num, wire);
            }
            num++;
        }
        searchCross();
        System.out.println("listCoordonate " + listCoordonate);
    }

    public Wire searchCross() {
        Wire crossList = new Wire(new ArrayList<Dot>());
        Wire firstWire = listCoordonate.get(0);
        for (int i = 0; i < firstWire.size() - 1; i++) {
            int x1 = firstWire.get(i).getX();
            int y1 = firstWire.get(i).getY();
            int x2 = firstWire.get(i + 1).getX();
            int y2 = firstWire.get(i + 1).getY();
            ArrayList<Dot> secondWire = listCoordonate.get(1);
            for (int j = 0; j < secondWire.size() - 1; j++) {
//                if ( x1 == x2) {
//                    if ()
//                }


//                switch (){
//                    case x1 == x2:
//                        break;
//                    case y1 == y2:
//                        break;
//                    default:
//                        break;
            }

        }
        return crossList;
    }


    public void readCoord(int num, String wire) {
        switch (wire.charAt(0)) {
            case 'U':
                y = y + Integer.parseInt(wire.substring(1));
                listOfListDot(num, x, y);
                break;
            case 'D':
                y = y - Integer.parseInt(wire.substring(1));
                listOfListDot(num, x, y);
                break;
            case 'R':
                x = x + Integer.parseInt(wire.substring(1));
                listOfListDot(num, x, y);
                break;
            case 'L':
                x = x - Integer.parseInt(wire.substring(1));
                listOfListDot(num, x, y);
                break;
            default:
                System.out.println("error");
                break;
        }
    }

    private void listOfListDot(int num, int x, int y) {
        listCoordonate.get(num).add((new Dot(x, y)));
    }
}
