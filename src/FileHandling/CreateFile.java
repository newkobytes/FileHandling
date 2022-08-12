package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter the file name and location path");
String  filename = s.nextLine();
try {
	FileOutputStream fos = new FileOutputStream(filename);
	System.out.println("Enter the file content");
	String content = s.nextLine();
	byte b[] = content.getBytes();
	try {
		fos.write(b);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		fos.close();
		System.out.println("File is saved");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();



	}
	}
}