package devBasicJavaDigitalOne.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioFinal {

	public static void main(String[] args) throws ParseException {
		
		
		/* Descubra o timeInMillis do dia que voc� nasceu,
		 * converta em um objeto Date, verifique se ele � anterior ou posterior 
		 * 15 de maior de 2010
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date aComparar = sdf.parse("15/05/2010");
		Date aniversario = sdf.parse("06/10/1990");
		System.out.println(aniversario.getTime());
		System.out.println(aniversario.after(aComparar)?"� Depois":aniversario.before(aComparar)?"� realmente antes":"� depois");
		
		
		
		
		
	}

}
