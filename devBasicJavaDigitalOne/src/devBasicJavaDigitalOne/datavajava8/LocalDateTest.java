package devBasicJavaDigitalOne.datavajava8;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateTest {

	public static void main(String[] args) {
	
		/*Classe imutável para representar uma data*/
		
	
		
		
		
		LocalDate hoje = LocalDate.now();
		LocalDate ontem = hoje.minusDays(1);
		System.out.println("Hoje: "+hoje);
		System.out.println("Ontem: "+ontem);
		
		
		
		
		
		
		
		
		

	}

}
