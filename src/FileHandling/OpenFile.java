package FileHandling;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path="C:/Users/S141/Desktop/CreateFile/Shar.txt"; //"C:/Users/S141/Desktop/CreateFile/Shar.txt";
//https://lms.simplilearn.com/courses/3916/Implement-software-development-and-database-fundamentals-through-agile/syllabus
File file = new File(path);

if (!Desktop.isDesktopSupported()) //to launch the applications registered on the desktop
{System.out.println("Desktop not supported");
return;
	
}
Desktop desktop = Desktop.getDesktop();
if(file.exists())
{
	try {
		desktop.open(file);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}

}
