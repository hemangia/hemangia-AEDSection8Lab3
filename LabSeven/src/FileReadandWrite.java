import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReadandWrite {
	
	// This is the method which will read the file and passed first five lines of file back to the calling method where it will display the returned 
	// content and display it into textarea
	public List<String> readFirst(String s1) throws IOException {
		final Path path = Paths.get(s1);
		final List<String> lines = new ArrayList<>(5);
	    try {
	    	
	    	final BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8) ;
	        
	        int lineNum = 0;
	        String line;
	        while ((line = reader.readLine()) != null && lineNum <= 5) {
	            lines.add(line);
	            lineNum++;
	        }
	       
	    }
	    catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		
		}
	    return lines; 
	}
	
/*This method is used to write into file. It takes 2 argument file name and input entered by user.
 * If file is already exist then it will append the input into the file
 * If file is not present then it will create a new file into the workspace and add the input into the file
 * 
 */
	public void writeFile(String filename, String input) {
		
		 File f = new File(filename);
	        boolean append = false;
	        try{
	            PrintWriter pw = null;
	            if ( f.exists() ) {
	                append = true; //file exist and this gives the user permission to append to the file
	                pw = new PrintWriter(new FileWriter(new File(filename), append));
	            }else {
	                append = false; //won't be appending to the file - creating a new file
	                pw = new PrintWriter(new FileWriter(new File(filename))); //creates the new file
	            }
	            boolean autoFlush = false; //keeps the file in memory

	            pw.println (input); //prints one line of data to the file
	            // The data includes two variables separated by commas
	            pw.close();//closes the file

	        }catch(Exception e){
	            System.out.println("There was an error: " + e);
	        }
	}

	
}
