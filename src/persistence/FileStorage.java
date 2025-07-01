package persistence;

import java.io.FileWriter;
import java.io.IOException;

public class FileStorage implements Persistence {
    @Override
    public void save(String data) {
        try (FileWriter outFile = new FileWriter("document.txt")) {
            outFile.write(data);
            System.out.println("Document saved to document.txt");
        } catch (IOException e) {
            System.out.println("Error: Unable to open file for writing.");
        }
    }
}
