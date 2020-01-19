package adventofcode.program.location;

import adventofcode.file.read.FileReadData;

import java.util.ArrayList;

public class WireLocalisation {
    private ArrayList<ArrayList<Dot>> listCoordonate = new ArrayList();
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
            listCoordonate.add(new ArrayList());
            listOfListDot(num, x, y);
            for (String wire : lC) {
                readCoord(num, wire);
            }
            num++;
        }
        searchCross();
        System.out.println("listCoordonate " + listCoordonate);
    }

    public ArrayList<Dot> searchCross() {
        ArrayList<Dot> crossList = new ArrayList<>();
        ArrayList<Dot> firstWire = listCoordonate.get(0);
        for (int i = 0; i < firstWire.size() - 1; i++) {
            int x1 = firstWire.get(i).getX();
            int y1 = firstWire.get(i).getY();
            int x2 = firstWire.get(i + 1).getX();
            int y2 = firstWire.get(i + 1).getY();
            ArrayList<Dot> secondWire = listCoordonate.get(1);
            for (int j = 0; j < secondWire.size() - 1; j++) {

//                if ((secondWire.get(j).getX() <= x1 && secondWire.get(j).getX() >= x2 ||
//                        secondWire.get(j).getX() >= x1 && secondWire.get(j).getX() <= x2) &&
//                        (secondWire.get(j).getY() <= y1 && secondWire.get(j).getY() >= y2 ||
//                                secondWire.get(j).getY() >= y1 && secondWire.get(j).getY() <= y2)) {
//                    System.out.println("plop " );
//                }
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
