package devBasicJavaDigitalOne.datavajava8;

import java.time.LocalTime;
import java.util.Scanner;

public class LocalTimeTest {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		menuShow();
		
		System.out.print("Informe o minuto do disparo: ");
		
		int min = 0;
		int tempoDisparo= input.nextInt();
		
		while(min<=tempoDisparo) {
			
			LocalTime agora2 = LocalTime.now();
			min = agora2.getMinute();
			
			if(min==tempoDisparo) {
				System.out.println("Alarme disparado!!!!!!!!15");
				return;
			}
		}
		input.close();
	
	}

	public static void menuShow() {
		
		System.out.println(" ---------------------- ");
		System.out.println("|    Relogio tabajara  |");
		System.out.println(" ---------------------- \n");
		
	}
	
	
}
