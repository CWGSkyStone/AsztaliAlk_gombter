package dev.skystone;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileHandler {
    static void writeToFile(String line){
        try{
            tryWirteToFile(line);
        }
        catch (IOException e){           
            System.err.println(e.getMessage());
        }
    }
    static void tryWirteToFile(String line) throws IOException{
        FileWriter wr = new FileWriter("results.txt", Charset.forName("UTF-8"), true);
        wr.write(line);
        wr.close();
    }

}
