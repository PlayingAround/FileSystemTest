package IO;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class SearchandCreateFiles {
	static Scanner keyboard;
	String file;
	int number;
	
	@SuppressWarnings("unused")
	public static void main(String args[]){
		CreateandSearch();
		
	}
	
	public static void CreateandSearch(){ 
		String choice;
		String path;
		keyboard=new Scanner(System.in);
		
		System.out.println("insert the path to the file");
		path=keyboard.nextLine();
		File x=new File(path);
		Formatter format;
		
		if( x.exists() )
		{
			System.out.println(x.getName() + " exist!");
			
		}
		
		else
		{
			System.out.println("this doesn't exist!");
		}
		
		System.out.println("do you want to create a file? insert yes or no:");
		choice=keyboard.nextLine();
		
		if(choice.equals("yes") )
		{
			String name;
			System.out.println("what do you want to name the file?:");
			name=keyboard.nextLine();
			try{
				
				format=new Formatter("C:\\Users\\502434608\\Desktop\\"+ name +".txt");
				System.out.println(name+".txt has been created");
			}
			catch(Exception e)
			{
				System.out.println("Sorry we have encountered a problem please try again.");
			}
		}
		else
		{
			System.out.println("Please join us again soon!");
		}
		
	}
}
