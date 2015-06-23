package IO;
import java.io.*;
import java.lang.*;
import java.util.*;

public class WriteToFiles {
	Formatter format;
	Formatter formats=new Formatter();
	
	FileReader read=new FileReader();
	
	public void openFile(){
	try{
		format=new Formatter("chinese.txt");
		
	}
	
	catch(Exception e)
	{
	System.out.println("there was an error");
	}
}
	
	public void addRecords(String fileName) {	
		String file=fileName;
		formats.format("%s", file);
	}
	
	public void closeFile(){
		format.close();
	}

	
	
	}


;