package adventofcode.file.read;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileReadData {
    protected File fichier;
    protected FileReader fr;
    protected BufferedReader br;
    protected String line;

    public String getLine() {
        return line;
    }

    public FileReadData(String source) {
        this.fichier = new File(source);
    }

    public String lecture() {
        try {
            line = br.readLine();
        } catch (IOException exception) {
            System.out.println("Erreur lors de la lecture :" + exception.getMessage());
        }
        return getLine();
    }

    public String
    intFile() {
        try {
            fr = new FileReader(fichier);
            br = new BufferedReader(fr);
            line = br.readLine();
        } catch (IOException exception) {
            System.out.println("Erreur lors de la initialisation :" + exception.getMessage());
        }

        return line;
    }

    public void closeFile() {
        try {
            br.close();
            fr.close();
        } catch (IOException exception) {
            System.out.println("Erreur lors de la fermeture :" + exception.getMessage());
        }
    }

    public List<String> readFileList(ArrayList<String> list) {
        try {
            Scanner reader = new Scanner(fichier);
            reader.useDelimiter(",");
            while (reader.hasNext()) {
                String s = reader.next();
                s = s.trim();
                s = s.replaceAll(",", "");
                list.add(s);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return list;
    }

    public ArrayList<ArrayList<String>> readFileListByLine(ArrayList<ArrayList<String>> list) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("wires"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                list.add(new ArrayList(Arrays.asList(values)));
            }
            br.close();
        } catch (IOException exception) {
            System.out.println("Erreur lors de la lecture :" + exception.getMessage());
        }
        return list;
    }
}
