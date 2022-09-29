import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<File> files = new ArrayList<>();
    static ArrayList<String> storedContent = new ArrayList<>();
    public static void getAllFiles(File [] myFiles , int index){
        for (File myFile : myFiles) {
            if (index == myFiles.length) {
                return;
            }
            if (myFile.isFile()) {
                files.add(myFile);
            }
            if (myFile.isDirectory()) {
                files.addAll(List.of(myFile.listFiles()));
            }
        }
    }
    public static void readFiles(){
        try{
            for (File file : files) {
                FileReader readFile = new FileReader(file);
                BufferedReader buffReader =new BufferedReader(readFile);
                String line;
                while( (line = buffReader.readLine()) != null){
                    storedContent.add(line);
                }
                buffReader.close();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void writeFile(String filePath){
        try {
            FileWriter writeFile = new FileWriter(filePath);
            PrintWriter writeLine = new PrintWriter(writeFile);

            for(String line : storedContent){
                writeLine.println(line);
            }
            writeLine.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) {

        String dirPath = "Question1/" + args[0];
        String outputFile= "Question1/" + args[1];
        File mainDir = new File(dirPath);
        File[] myFiles = new File[0];

        if (mainDir.exists() && mainDir.isDirectory()) {
            myFiles = mainDir.listFiles();
        }
        getAllFiles(myFiles, 0);
        readFiles();
        writeFile(outputFile);

    }
}