package FileHandling;

import java.io.File;
import java.util.Arrays;

public class PrintFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file = new File("C:/Users/S141/Desktop");
File pathlist[]= file.listFiles();
Arrays.sort(pathlist);

for (File e : pathlist)
{
	if(e.isFile())
	{
		System.out.println("File" + e.getName());
	}
	else if (e.isDirectory())
	{
		System.out.println("Directory " + e.getName());
	}
	else{
		System.out.println("Not known " + e.getName());
	}
	}

	}

}
