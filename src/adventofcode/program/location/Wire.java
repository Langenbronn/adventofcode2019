package adventofcode.program.location;

import java.util.ArrayList;

public class Wire extends ArrayList<Dot> {
    private ArrayList<Dot> dotList = new ArrayList();

    public Wire(ArrayList<Dot> dotList) {
        this.dotList = dotList;
    }

    public ArrayList<Dot> getDotList() {
        return dotList;
    }

    public void setDotList(ArrayList<Dot> dotList) {
        this.dotList = dotList;
    }
}
