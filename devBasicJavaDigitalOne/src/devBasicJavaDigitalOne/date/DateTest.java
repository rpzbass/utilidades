package devBasicJavaDigitalOne.date;

import java.util.Date;

public class DateTest {

	
	public static void main(String [] args) {
	
		
		Long atualTempoMilissegundos = System.currentTimeMillis();
		
		System.out.println(atualTempoMilissegundos);
		
		Date novaData = new Date(atualTempoMilissegundos);
		System.out.println(novaData);
		
	
		
		
		
		
		
		
		
	}
	
	
}
