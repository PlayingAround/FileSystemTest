import IO.FileReader;
import IO.WriteToFiles;
import IO.SearchandCreateFiles;

public class mainForTesting {
	
	public static void main(String args[]){
		WriteToFiles write=new WriteToFiles();
		SearchandCreateFiles search=new SearchandCreateFiles();
		FileReader read=new FileReader();
		
	//	write.openFile();
		
		read.openFile();
		read.readfile();
		read.closefile();

		
		/* read.openFile();
		write.openFile();
		read.readfile();
		read.closefile();
		write.closeFile(); */
		
		
		
		
	}
	
	
	

}
