package adventofcode.program.alarm;

import adventofcode.file.read.FileReadData;
import adventofcode.tool.Tool;

import java.util.ArrayList;

public class Intcode {
    private ArrayList<Integer> listIntcode = new ArrayList();
    private Tool tool = new Tool();

    public ArrayList<Integer> intcodeList(String source) {
        FileReadData fRead = new FileReadData(source);
        ArrayList<String> list = new ArrayList();
        fRead.readFileList(list);
        listIntcode = tool.getIntegerArray(list);
        int sequence = 0;
        int opcode = 0;
        while (opcode != 99) {
            opcode = opcodeSequence(sequence*4);
            sequence++;
        }
        return listIntcode;
    }

    private int opcodeSequence(int opcode) {
        switch (listIntcode.get(opcode)) {
            case 1:
                listIntcode.set(listIntcode.get(opcode+3), listofList(opcode+1) + listofList(opcode+2));
                break;
            case 2:
                listIntcode.set(listIntcode.get(opcode+3), listofList(opcode+1) * listofList(opcode+2));
                break;
            case 99:
                break;
            default:
                System.out.println("error");
                break;
        }
        return listIntcode.get(opcode);
    }

    private int listofList(int n) {
        return listIntcode.get(listIntcode.get(n));
    }

}
