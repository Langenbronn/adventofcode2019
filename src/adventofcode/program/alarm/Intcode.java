package adventofcode.program.alarm;

import adventofcode.file.read.FileReadData;

import java.util.ArrayList;

public class Intcode {
    private ArrayList<String> list = new ArrayList<String>();

    public ArrayList<String> intcodeList(String source) {
        FileReadData fRead = new FileReadData("programAlarm");
        fRead.readFileByLine(list);
        System.out.println("list : "+ list);
        int sequence = 0;
        while (sequence == 5) {
            list.get(sequence*4);
            sequence++;
        }

        return list;
    }

    public void opcode(){

    }
}
