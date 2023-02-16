package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PruebasFecha {

	public static void main(String[] args) {
		try {
			SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd");
			Date antes = new Date();
			Date despues = sdf.parse("2024-10-01");
			
			if(antes.after(despues)) {
				System.out.println(" asdfasd");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
