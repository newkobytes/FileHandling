package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path = "C:/Users/S141/Desktop/FileHandling/Read file/FileReader/FileReader.txt";
try {
	FileReader fr= new FileReader(path);
	System.out.println("The content is ");
	
	int c =0;
	try {
		while((c=fr.read())!=-1)
		{
			System.out.print((char) c);
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally 
	{
	try {
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
