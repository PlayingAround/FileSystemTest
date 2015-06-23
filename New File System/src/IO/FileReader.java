package IO;

import java.util.*;
import java.io.*;

public class FileReader {
	
	private Scanner keyboard;
	
	public void openFile(){
		try 
		{ 
		keyboard=new Scanner(new File("C:\\Users\\502434608\\Desktop\\Filesystem.txt"));	
		}
		
		catch(Exception e)
		{
			System.out.println("Could not find file");
		}
	
	}
	
	public  ArrayList<String> readfile(){
		WriteToFiles write=new WriteToFiles();
		
		ArrayList<String> storeFileNames = new ArrayList<String>();
		String token, element, str;
		int j =0;
	
		for(int i =0; keyboard.hasNext(); )
		{	
			
			
			token =keyboard.nextLine(); 
			storeFileNames.add(token);
			//	write.addRecords(token);
			
			System.out.println(token);
			
			while(j<i+11){
			
			
			//System.out.println(token);
		//	System.out.println(str);
			str = (j+"_");
			//	System.out.println(str);
			//System.out.println("The change of the name");
			//System.out.println(str+"_"+token);
			element=(str+"_"+token);
			//element = str+token;
			
			storeFileNames.add(element);
		//	storeFileNames.add(element);
			System.out.println(element);
			//System.out.println(token);
		//	write.addRecords(element);
			
			 
			j++;
			}
			i=j;
		
			
		
		}
	//	for(String line: storeFileNames){
	//		System.out.println(line); 
		//	write.addRecords(line);
			
	//	}
			
			
		
		for(int x=1; x<10; x++)
		{
			
	//	System.out.println(storeFileNames.get(x));
	}
			return null;
	}
	
	
	public void closefile(){
		keyboard.close();
	}
	
}
