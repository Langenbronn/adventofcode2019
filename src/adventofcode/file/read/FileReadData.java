package adventofcode.file.read;

import java.io.*;
import java.util.ArrayList;
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
            // System.out.println(line);
            line = br.readLine();
        } catch (IOException exception) {
            System.out.println("Erreur lors de la lecture :" + exception.getMessage());
        }
        return getLine();
    }

    public String intFile() {
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

    public static List<String> readFileByLine(ArrayList<String> list, String fileName){
        try{
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            reader.useDelimiter(",");
            while(reader.hasNext()){
                String s = reader.next();
                s= s.trim();
                s= s.replaceAll("," , "");
                list.add(s);
            }
            reader.close();
        }
        catch(FileNotFoundException e){ System.err.println("Error: " + e.getMessage());}

        return list;
    }
}
