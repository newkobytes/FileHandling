package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class ReadFileUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path = "C:/Users/S141/Desktop/FileHandling/Read file/FileReaderScanner/FileReaderScanner.txt";
File file = new File(path);
try {
	Scanner s = new Scanner(file);
	System.out.println("the file content is ");
	while (s.hasNextLine()){
		System.out.println(s.nextLine());
	}
	
}

catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
	
}

