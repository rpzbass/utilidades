package devBasicJavaDigitalOne.datavajava8;

import java.time.LocalDateTime;
/**
 * 
 * @author Marvis
 * Exemplo de como manipular LocalDateTime
 *
 */
public class LocalDateTimeTest {

	public static void main(String[] args) {
		
		/* LocalDateTime funciona como uma especie de jun��o entre o LocalTime e o LocalDate
		 * Tambeme � uma classe imut�vel e voc� consegue trabalhar com dia e hora de uma s� vez.
		 * Voc� pode manipular a data e hora com precis�o de nanossegundos.
		 * */
		
		LocalDateTime agora = LocalDateTime.now();
		
		System.out.println(agora);
		
		LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);
		
		System.out.println(futuro);
		
		
		

	}

}
