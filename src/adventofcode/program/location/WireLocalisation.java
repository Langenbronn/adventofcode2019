package adventofcode.program.location;

import adventofcode.file.read.FileReadData;
import adventofcode.tool.ConvertTool;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;

public class WireLocalisation {
    private ArrayList<Dot> listCoordonate = new ArrayList<Dot>();
    private ConvertTool convertTool;

    public WireLocalisation(ArrayList<Dot> listCoordonate) {
        this.listCoordonate = listCoordonate;
    }

    public ArrayList<Dot> getListCoordonate() {
        return listCoordonate;
    }

    public void setListCoordonate(ArrayList<Dot> listCoordonate) {
        this.listCoordonate = listCoordonate;
    }

    public void convertWireTo (String source)  {
        FileReadData fRead = new FileReadData("programAlarm");
        ArrayList<String> list = new ArrayList<String>();
        fRead.readFileByLine(list);
    }

    public void readCoord (String wire){
        switch (wire.charAt(0)) {
            case 'U':
                listCoordonate.add(new Dot (1,1));
                break;
            case 'D':
                listCoordonate.add(new Dot (1,1));
                break;
            case 'R':
                listCoordonate.add(new Dot (1,1));
                break;
            case 'L':
                listCoordonate.add(new Dot (1,1));
                break;
            default:
                System.out.println("error");
                break;


        }
    }
}
