package devBasicJavaDigitalOne.date;

import java.util.Date;

public class DateTest2 {

	public static void main(String[] args) {
		
		Date dataNoPassado = new Date(1513124807691L);
		Date dataNoFuturo = new Date(1613124807691L);
		
		/* Comparando se a dataNoPassado � posterior a dataNofuturo */
		boolean isAfter = dataNoPassado.after(dataNoFuturo);
		
		System.out.println(isAfter);
		
		/* Comparando se datanoPassado � antes que a data no Futuro */
		boolean isBefore = dataNoPassado.before(dataNoFuturo);
		
		System.out.println(isBefore);
		
	
	
	}

}
