package eu.kliba.filetasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFromAFile {

    /**
     * Reads the content of a file then prints it out. If the file path is not valid it goes to IOException
     * @param filePath path of the file with file name.
     */
    public void readAndPrintFromAFile(String filePath) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            System.out.println("File contains: " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
