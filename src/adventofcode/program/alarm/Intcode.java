package adventofcode.program.alarm;

import adventofcode.file.read.FileReadData;
import adventofcode.tool.ConvertTool;

import java.util.ArrayList;

public class Intcode {
    private ArrayList<Integer> listIntcode = new ArrayList();
    private ConvertTool convertTool;

    public ArrayList<String> intcodeList(String source) {
        FileReadData fRead = new FileReadData(source);
        ArrayList<String> list = new ArrayList<String>();
        fRead.readFileByLine(list);
        listIntcode = convertTool.getIntegerArray(list);
        int sequence = 0;
        int opcode = 0;
        while (opcode != 99) {
            System.out.println("sequence " + sequence);
            System.out.println("change " + listIntcode);
            opcode = opcodeSequence(sequence*4);
            System.out.println("opcode " + opcode);
            sequence++;
        }
        return list;
    }

    private int opcodeSequence(int opcode) {
        int op0 = listIntcode.get(opcode);
        int op1 = listIntcode.get(opcode + 1);
        int op2 = listIntcode.get(opcode + 2);
        int op3 = listIntcode.get(opcode + 3);
        int op11 = listIntcode.get(op1);
        int op22 = listIntcode.get(op2);
        int op33 = listIntcode.get(op3);
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
