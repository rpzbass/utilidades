package devBasicJavaDigitalOne.desafio;

import java.util.Scanner;

public class DesafioLogicaDiferenteCopiado {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
	
		while( leitor.hasNext()) {
	
			String [] relogio = leitor.nextLine().split(":");
			int hora = Integer.parseInt(relogio[0]);
			int min = Integer.parseInt(relogio[1]);
			
			switch(hora) {
			
			case 7: System.out.println("Atraso maximo: "+min); break;
			case 8: System.out.println("Atraso maximo: "+((480+min)-420));break;
			case 9: System.out.println("Atraso maximo: "+((540+min)-420));break;
			default: System.out.println("Atraso maximo: 0");
			}
			
			
			
		}
		
		
	

	}

}
