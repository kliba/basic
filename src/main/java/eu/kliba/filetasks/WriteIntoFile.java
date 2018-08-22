package eu.kliba.filetasks;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteIntoFile {

    /**
     * Writes the content parameter into a file. If the filePath is not valid it gets IOException.
     * @param filePath A String where the value is the path with the file name.
     * @param content A string what should be written into the file.
     */
    public void writeInAFile(String filePath, String content) {
        Path fileDirectory = Paths.get(filePath);
        //checks if the file exists
        try (BufferedWriter writer = Files.newBufferedWriter(fileDirectory, Charset.forName("UTF-8"))) {
            writer.write(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
