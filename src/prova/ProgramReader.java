package prova;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramReader {

	public static void main(String[] args) {
		
		try {
			BufferedReader in
			   = new BufferedReader(new FileReader("./test/divina_commedia.txt"));
			
			String line = null;
			while((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
