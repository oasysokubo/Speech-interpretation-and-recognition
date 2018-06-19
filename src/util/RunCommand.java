package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class takes in a command and executes it using RunTime class
 */
public class RunCommand {
	
	public RunCommand(String s) {
		
		String t = null;
		
		try {
			// Runtime execution
			Process p = Runtime.getRuntime().exec(s);
			
			// BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			
			// Check if there has any errors with executing command
			if((t = error.readLine()) != null) {
				System.out.println("Error: ");
				while(t != null) {
					System.out.println(t);
				}
			}
			
			System.exit(0);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		}
		
	}
}
