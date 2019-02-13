package prova;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ProgramReader2 {

	public static void main(String[] args) {
		
		try {
			Path path = FileSystems.getDefault().getPath("test", "divina_commedia.txt");
		    BufferedReader in = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1);
		     
			String line = null;
			while((line = in.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
