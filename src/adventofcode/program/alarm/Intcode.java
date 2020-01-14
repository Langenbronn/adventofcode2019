package adventofcode.program.alarm;

import adventofcode.file.read.FileReadData;

import java.util.ArrayList;

public class Intcode {
    private ArrayList<String> list = new ArrayList<String>();

    public ArrayList<String> intcodeList(String source) {
        FileReadData fRead = new FileReadData("programAlarm");
        fRead.readFileByLine(list);
        System.out.println("list : "+ list);
        return list;
    }

    public void opcode()
}
