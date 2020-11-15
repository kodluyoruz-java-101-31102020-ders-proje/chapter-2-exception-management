package chapter2.exceptions.samples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataConverter {
	
	public int readIntFromKeyboard() {
		
		Scanner scanner = new Scanner(System.in);
		
		// bu örnekte hatayı tespit ediyoruz ve oluştuğu noktada önlemler alıyoruz.
		try 
		{	
			String inputFromKeyboard = scanner.nextLine();
			
			int number = Integer.parseInt(inputFromKeyboard);
			
			return number;
			
		}
		catch (ArithmeticException e) 
		{
			// e.printStackTrace();
			System.out.println("Number conversion exception occured!");
		}
		catch (Exception e) 
		{
			// e.printStackTrace();
			System.out.println("Number conversion exception occured!");
		}
		// hata olsun veya olmasın mutlaka çalıştırılır.
		finally 
		{
			scanner.close();
		}
		
		return -1;
	}
	
	
	public Date convertToDate(String dateAsText) throws ParseException{
		
		// "2020-12-29"
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
	
		// bu örnekte ise String haldeki date bilgisini Date verisine çevirmeye çalıştık.
		// parse fonksiyonu "ParseException" tipinde bir hata fırlattığı için biz de bu hatayı çağrıldığımız bir üste ilettik.
		return dateFormatter.parse(dateAsText);
	}
	
	public int indexOf(String value, String searchedText) throws BatuxException {
		
		if(value == null) {
			throw new BatuxException(1005, "Gelen değer null olamaz!");
		}
		
		return value.indexOf(searchedText);
	}
	
}
