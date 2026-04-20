package dev.skystone;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    static void writeToFile(String line){
        try (FileWriter writer = new FileWriter("results.txt", true)){
            writer.write(line);
        }
        catch (IOException e){           
            System.err.println(e.getMessage());
        }
    }
}
