package devBasicJavaDigitalOne.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args)  {
		
		
		Date agora = new Date();
		String padrao = "dd/MM/yyyy HH:mm:ss";
		
		SimpleDateFormat sdf = new SimpleDateFormat(padrao);
		String dataFormatada = sdf.format(agora);
		System.out.println(dataFormatada);
		
		
		
		
		

	}

}
