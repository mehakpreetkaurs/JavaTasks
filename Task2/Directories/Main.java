package Directories;

import java.nio.file.DirectoryIteratorException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {

        Path directory = FileSystems.getDefault().getPath("FileTree\\Dir2");  // FileTree\\Dir2 (windows)
        try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory)) {
            for (Path file : contents) {
                System.out.println(file.getFileName());
            }

        } catch (IOException | DirectoryIteratorException e) {
            System.out.println(e.getMessage());
        }
    }
}