package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	copyFile();	
		

	}
public static void copyFile()
{
	File infile = new File("C:/Users/S141/Desktop/CopyFile/Shar.txt");
	File opfile = new File ("C:/Users/S141/Desktop/CopyFile/Shar-1.txt");
	
	FileInputStream fileinput = null; //---to read data from a source
	FileOutputStream fileoutput = null;//--to write data to a destination
	
	try {
		fileinput = new FileInputStream(infile);
		fileoutput = new FileOutputStream(opfile);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	int i=0;
	try {
		while((i=fileinput.read())!=-1)
		{
			fileoutput.write(i);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		if(fileinput!=null)
		{
			try {
				fileinput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (fileoutput!=null)
		{
			try {
				fileoutput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
}
