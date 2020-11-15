package chapter2.exceptions.samples;

import java.io.IOException;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws BatuxException, ParseException, IOException {
		// TODO Auto-generated method stub

		DataConverter dataConverter = new DataConverter();
		
		//dataConverter.convertToDate("2020-12-29");

		
		//System.out.println(dataConverter.readIntFromKeyboard());
		
		
		System.out.println(dataConverter.indexOf(null, "ata"));
		
		dataConverter.convertToDate(null);
	}

}
