package FileSystemPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  /*      try {
			Path fileToCreate = FileSystems.getDefault().getPath("/Java2/src/FileSystemPath/Example","file2.txt");
			Files.createFile(fileToCreate);
			
			Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
            Files.createDirectory(dirToCreate);  // directory created by this method
            
			Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
            Files.deleteIfExists(fileToDelete); // deleting file  
     /*		Path fileToMove = FileSystems.getDefault().getPath("C:\\Users\\USER\\eclipse-workspace\\Java2\\src\\FileSystemPath\\Example\\""file1copy.txt");
		Path destination = FileSystems.getDefault().getPath("C:\\Users\\USER\\eclipse-workspace\\Java2\\src\\FileSystemPath\\Example\\Dir1");
		Files.move(fileToMove, destination); // moving file from example to Dir 1
	
/*		try {
            Path sourceFile = FileSystems.getDefault().getPath("C:\\Users\\USER\\eclipse-workspace\\Java2\\src\\FileSystemPath\\Example\\file1.txt");
            Path copyFile = FileSystems.getDefault().getPath("C:\\Users\\USER\\eclipse-workspace\\Java2\\src\\FileSystemPath\\Example\\file1copy.txt");
            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING); // Third parameter//copyfile gets created
            
            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);


        } catch(IOException e) {
            e.printStackTrace();
        } 
        
	}
}  */
		
        Path path = FileSystems.getDefault().getPath("C:\\Users\\USER\\eclipse-workspace\\Java2\\src\\FileSystemPath\\WorkingDirectoryFile.txt");
        printFile(path);
        Path filePath = FileSystems.getDefault().getPath("C:\\Users\\USER\\eclipse-workspace\\Java2\\src\\FileSystemPath\\files\\SubdirectoryFile.txt");
        printFile(filePath);
        filePath = Paths.get("D:\\DOCS\\OutThere.txt");
        printFile(filePath);
        // D:\\Examples\\OutThere.txt
    /*    printFile(filePath);filePath = Paths.get(".");// gets the absolute path
        System.out.println(filePath.toAbsolutePath());
        // D:\Examples\.\subfolder\..\directory
        // D:\Examples\directory
        Path path2 = FileSystems.getDefault().getPath(".", "C:\\Users\\USER\\eclipse-workspace\\Java2\\src\\FileSystemPath\\", "..", "files", "SubdirectoryFile.txt");// this path will get us to Subdir file
        System.out.println(path2.normalize().toAbsolutePath());// . represent workdir .. currentdir
        printFile(path2.normalize());
        
        Path path3 = FileSystems.getDefault().getPath("thisFileDoesn'tExist");
        System.out.println(path3.toAbsolutePath());
        
        Path path4 = Paths.get("/Volumes/Test/ING", "abcdef", "whatever.txt");
//        // "Z:\\", "abddef", "whatever.txt"
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files"); // we can check if that folder/file exists with this method
//        System.out.println("Exists = " + Files.exists(filePath));// we get a boolean output true or false.
//
//        System.out.println("Exists = " + Files.exists(path4));

    } */

    private static void printFile(Path path) {
        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
} 
