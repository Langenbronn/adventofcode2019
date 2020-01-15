package adventofcode.program.alarm;

import adventofcode.file.read.FileReadData;

import java.util.ArrayList;

public class Intcode {
    private ArrayList<Integer> listIntcode = new ArrayList<Integer>();

    public ArrayList<String> intcodeList(String source) {
        FileReadData fRead = new FileReadData("programAlarm");
        ArrayList<String> list = new ArrayList<String>();
        fRead.readFileByLine(list);
        listIntcode = getIntegerArray(list);
        int sequence = 0;
        while (sequence == 5) {
            opcodeSequence(sequence*4);
            sequence++;
        }

        return list;
    }

    private void opcodeSequence(int opcode) {
        switch (listIntcode.get(opcode)) {
            case 1:
                break;
            case 2:
                break;
            case 99:
                break;
            default:
                break;
        }
    }

    private ArrayList<Integer> getIntegerArray(ArrayList<String> stringArray) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(String stringValue : stringArray) {
            try {
                result.add(Integer.parseInt(stringValue));
            } catch(NumberFormatException nfe) {
                System.out.println("Could not parse " + nfe);
            }
        }
        return result;
    }
}
