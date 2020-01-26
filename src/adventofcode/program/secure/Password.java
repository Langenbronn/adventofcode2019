package adventofcode.program.secure;

import java.util.ArrayList;

public class Password {

    public int passwordPossibility(ArrayList<Integer> puzzle) {
        int possibility = 0;


        return possibility;
    }

    public void searchPossibility(ArrayList<Integer> puzzle, int i, ArrayList<Integer> result) {
        ArrayList<Integer> puzzlebis = new ArrayList<Integer>(puzzle);
        i--;
        for (Integer n : puzzle) {
            ArrayList<Integer> result1 = new ArrayList<Integer>(result);
            if (puzzlebis.size() < i+1) {
                break;
            }
            if (i + 1 <= 0) {
                System.out.println("result: " + result1 );
                break;
            }
//           System.out.println(puzzlebis + " + " + i);
            puzzlebis.remove(0);
//           System.out.println(puzzlebis + " + " + i);
            result1.add(n);
//           System.out.println("result: " + result1);
            searchPossibility(new ArrayList<Integer>(puzzlebis), i, result1);
        }
    }

    public boolean checkRules(ArrayList<Integer> solution) {
        Integer n1 = null;
        boolean adjacent = false;
        boolean sixdigit = false;
        boolean increase = true;
        if (solution.size() == 6) {
            sixdigit = true;
        }
        for (Integer n : solution) {
            if (n1 != null) {
                if (n == n1) {
                    adjacent = true;
                }
                if (n < n1) {
                    increase = false;
                }
            }
            n1 = n;
        }
        return false;
    }
}
