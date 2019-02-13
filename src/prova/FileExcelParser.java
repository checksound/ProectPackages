package prova;

import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class FileExcelParser {	

	public static void main(String[] args) {
		String csvData = "test/ORDINI_IN_ESSERE.xlsx";
		CSVParser parser;
		try {
			parser = CSVParser.parse(csvData, CSVFormat.EXCEL);
			for (CSVRecord csvRecord : parser) {
			     System.out.println(csvRecord);
			     Iterator<String> iter = csvRecord.iterator();
			     while(iter.hasNext()) {
			    	 String value = iter.next();
			    	 System.out.println(value);
			     }
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
