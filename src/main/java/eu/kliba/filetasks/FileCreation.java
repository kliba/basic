package eu.kliba.filetasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreation {

    /**
     * Using NIO interfaces it is creating a directory if the input String contains the correct existing path.
     * If the path is not correct so the path is not valid this method goes to IOException.
     *
     * @param path The path is a String where the directory path is excepted.
     */
    public void createDirectory(String path) {
        Path tempPath = Paths.get(path);
        //if directory exists?
        if (!Files.exists(tempPath)) {
            try {
                Files.createDirectories(tempPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void createFile(String path, String fileName) {
        Path newFilePath = Paths.get(path, fileName);
        //check if the path exists
        if (!Files.exists(newFilePath)) {
            try {
                Files.createFile(newFilePath);
            } catch (IOException e) {
                e.getCause();
            }
        }
    }
}
