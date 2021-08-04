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
		
		/* LocalDateTime funciona como uma especie de junção entre o LocalTime e o LocalDate
		 * Tambeme é uma classe imutável e você consegue trabalhar com dia e hora de uma só vez.
		 * Você pode manipular a data e hora com precisão de nanossegundos.
		 * */
		
		LocalDateTime agora = LocalDateTime.now();
		
		System.out.println(agora);
		
		LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);
		
		System.out.println(futuro);
		
		
		

	}

}
