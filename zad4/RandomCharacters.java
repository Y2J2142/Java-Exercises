import java.util.Random;
import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class RandomCharacters{


public static void IOSaveToFile()
{
    try{

        
        Random random = new Random();
        BufferedWriter writer = new BufferedWriter( new FileWriter("plik.txt"));
        for(int i = 0; i < 1000; i++){
            char character = (char) (random.nextInt(127-32) + 32);
           // System.out.print(character);
            writer.append(character);
        }
        writer.close();
    }catch(IOException e) {e.printStackTrace();} 
}

public static void IOReadFromFile()
{
    try{

    
        BufferedReader reader = new BufferedReader(new FileReader("plik.txt"));
        int character;
        while((character = reader.read()) != -1);
            //System.out.print((char) character);
        reader.close();
    }catch(IOException e) {e.printStackTrace();}
}


public static void NIOSaveToFile(){
    Random random = new Random();
    Path file = Paths.get("plik.txt");
    try{
        BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.CREATE);
        for(int i = 0; i < 1000; i++){
            char temp = (char)(random.nextInt(127-32) + 32);
            //System.out.print(temp);
            writer.write( temp);

        }
        writer.flush();
        writer.close();
    }catch(IOException e) {e.printStackTrace();}
    
}

public static void NIOReadFromFile(){

    try{

        
        BufferedReader reader = Files.newBufferedReader(Paths.get("plik.txt"));
        String line;
        while((line = reader.readLine()) != null){
            //System.out.print(line);
        }
    }catch(IOException e) {e.printStackTrace();}

}




public static void main(String[] args)
{
    long startTime = System.nanoTime();
    IOSaveToFile();
    IOReadFromFile();
    System.out.println("IO  : " + (System.nanoTime() - startTime) + "ns");
    startTime = System.nanoTime();
    NIOSaveToFile();
    NIOReadFromFile();
    System.out.println("NIO : " + (System.nanoTime() - startTime) + "ns");
    
}




}
