package devBasicJavaDigitalOne.date;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	
	public static void main(String [] args) {
	
		
		Long atualTempoMilissegundos = System.currentTimeMillis();
		
		System.out.println(atualTempoMilissegundos);
		
		Date novaData = new Date(atualTempoMilissegundos);
		System.out.println(novaData);
		
		
		
	//	date.setTime(date.getTime());
		
		Calendar c = Calendar.getInstance();
		//c.setTime(date);
		
		if(Calendar.SUNDAY == c.getFirstDayOfWeek()){
			
			System.out.println("Primeiro dia da semana");
			
		}else {
			System.out.println("Não e o primeiro dia da semana");
		}
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}
	
	
}
