package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileusingBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:/Users/S141/Desktop/FileHandling/Read file/BufferedReader/BufferedReader.txt";
		File file = new File(path);
		BufferedReader bf = null;
		try {
			
			 bf = new BufferedReader(new FileReader (file));
			System.out.println("The content is ");
			int b =0;
			try {
				while((b=bf.read())!=-1)
				{
					
					System.out.print((char)b);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
