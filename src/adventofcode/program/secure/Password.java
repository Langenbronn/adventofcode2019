package adventofcode.program.secure;

import java.util.ArrayList;

public class Password {

   public int passwordPossibility(ArrayList<Integer> puzzle) {
       int possibility = 0;


       return possibility;
    }

    public void searchPossibility(ArrayList<Integer> puzzle, int i) {
        ArrayList<Integer> puzzlebis = new ArrayList<Integer>(puzzle);
        i--;
       for (Integer n : puzzle) {
           System.out.println(puzzlebis + " + " + i);
           puzzlebis.remove(0);
           System.out.println(puzzlebis + " + " + i);
           if (puzzlebis.size() < i+1 || i+1 <= 0) break;
           searchPossibility(new ArrayList<Integer>(puzzlebis), i);
       }
    }
}
