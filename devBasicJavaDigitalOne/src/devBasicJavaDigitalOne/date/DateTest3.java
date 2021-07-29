package devBasicJavaDigitalOne.date;

import java.util.Date;

public class DateTest3 {

	public static void main(String[] args) {

		
		Date dataNoPassado = new Date(1513124807691L);
		
		Date dataNoFuturo = new Date(1613124807691L);
		
		Date mesmaDataNoFuturo = new Date(1613124807691L);
		
		boolean isEqual =  dataNoFuturo.equals(mesmaDataNoFuturo);
		
		System.out.println("As datas são iguais? : "+ isEqual);
		
		int compareCase1 = dataNoPassado.compareTo(dataNoFuturo);
		
		int compareCase2 = dataNoFuturo.compareTo(dataNoPassado);
		
		int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo);
		
		System.out.println("Compara data passado com futuro: "+ compareCase1);
		
		System.out.println("Compara data futuro com passado: "+ compareCase2);
		
		System.out.println("Compara data futuro com futuro: "+ compareCase3);
		
		/*-1     0     1*/
		
		
			
		
		
	}

}
