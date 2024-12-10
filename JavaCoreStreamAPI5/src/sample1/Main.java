package sample1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String filePath = "D:\\Java 11.09.2024\\JavaCoreStreamAPI5\\src\\sample1\\directory.txt";
		 try {
	            List<String> directory = Files.readAllLines(Paths.get(filePath));
	            for (String dirPath : directory) {
	                File dir = new File(dirPath);
	                if (dir.isDirectory()) {
	                	File[] txtFiles = dir.listFiles((d, name) -> name.endsWith(".txt"));
	                	if (txtFiles != null && txtFiles.length > 3) {
                        System.out.println("Directory with more than 3 text files: " + dirPath);
                        return;
	                }
	}
	
}
	            System.out.println("No matching directory found.");
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }
	}
