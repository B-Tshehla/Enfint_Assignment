import java.io.*;
import java.util.*;

public class ConcatFiles {
    //Global Variables
    static ArrayList<File> files = new ArrayList<>();
    static Map<File,String> listDependents =new HashMap<>();
    static Map<File,String> content = new HashMap<>();


    //Method stores all files in main directory and subdirectories in a list
    public static void getAllFiles(File [] myFiles){
        //loop through files in the main directory
        if(myFiles.length != 0){
            for (File myFile : myFiles) {
                if (myFile.isFile()) {
                    files.add(myFile);
                }
                if (myFile.isDirectory()) {
                    //recursive function to search subDirectories
                    getAllFiles(myFile.listFiles());
                }
            }
        }else{
            throw new NullPointerException();
        }

    }
    //Method reads all the files and stores their content in a list
    public static void readFiles(){
        try{
                for(File file : files ){
                    FileReader readFile = new FileReader(file);
                    BufferedReader buffReader =new BufferedReader(readFile);
                    String line;
                    String requireName;
                    StringBuilder fileCon = new StringBuilder();
                    while( (line = buffReader.readLine()) != null){
                        if (line.charAt(0) == '*') {
                            requireName = getRequiredFileName(line);
                            listDependents.put(file,requireName);
                        }
                        else {
                            fileCon.append(line).append("\n");
                        }
                    }
                    content.put(file,fileCon.toString());
                    buffReader.close();
                }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static File getRequiredFile(String filename){
        File requiredFile = null;
        for(File file : files){
            if(file.getName().equals(filename)){
                requiredFile = file;
                break;
            }
        }
        return requiredFile;
    }
    //Method get name of the required file from the link
    public static String getRequiredFileName(String line){
        String tmp = line.substring(line.indexOf("'"));
        String tmp2;
        tmp2 = tmp.substring((tmp.indexOf("/")));
        tmp =tmp2.substring(tmp2.indexOf(" "),tmp2.indexOf("'"))+".txt";
        return tmp.trim();
    }

    //Method write the content of all the files to an output file
    public static void writeFile(String filePath){
        try {
            FileWriter writeFile = new FileWriter(filePath);
            PrintWriter writeLine = new PrintWriter(writeFile);
            File requiredFile;

                for (File file : files){
                    if(listDependents.containsKey(file)){
                        requiredFile = getRequiredFile(listDependents.get(file));
                        writeLine.println(content.get(requiredFile));
                        writeLine.println(content.get(file));
                    }
                    else{
                        writeLine.println(content.get(file));
                    }
                }
            writeLine.println("\n\n");
            writeLine.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {

        try {
            //Console Arguments main directory path and output path
            String dirPath = args[0];
            String outputFile= args[1];
            //Creating new main Directory file
            File mainDir = new File(dirPath);
            //Declaring array of file
            File[] myFiles;

            //check if file exists and is a Directory
            if (mainDir.exists() && mainDir.isDirectory()) {
                    myFiles = mainDir.listFiles();
            }else {
                throw new RuntimeException("Directory Does not exist or file is not a directory");
            }
            //function call
            getAllFiles(myFiles);
            readFiles();
            writeFile(outputFile);
        }catch ( NullPointerException e){
            System.err.println("A "+e.getMessage()+" value was caught.");
        }
        catch (RuntimeException e){
            System.err.println(e.getMessage());
        }

    }
}