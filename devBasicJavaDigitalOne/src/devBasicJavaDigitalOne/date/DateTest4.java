package devBasicJavaDigitalOne.date;

import java.time.Instant;
import java.util.Date;

public class DateTest4 {

	public static void main(String[] args) {
		
		
		Date dataInicio = new Date(1513124807691L);
		System.out.println(dataInicio);
		
		Instant instant = dataInicio.toInstant();
		System.out.println(instant);
		
		
		

	}

}
