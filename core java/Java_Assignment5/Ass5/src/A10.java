import java.io.File;

// 10) Java program to traverse all files of a directory/folder
public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File[] files = new File("C:/").listFiles();
	   
	

	
	    for (File file : files) {
	        if (file.isDirectory()) {
	            System.out.println("Directory: " + file.getName());
	           // showFiles(file.listFiles()); // Calls same method again.
	        } else {
	            System.out.println("File: " + file.getName());
	        }
	    }
	    
	    }
	}
	


