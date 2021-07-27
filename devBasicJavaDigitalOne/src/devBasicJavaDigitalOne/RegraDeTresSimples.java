package devBasicJavaDigitalOne;

import java.util.Scanner;

public class RegraDeTresSimples {

	public static void main(String[] args) {
		
		/*
		 *  Com velocidade média de 80km/h, fiz uma viagem em 6 horas se a
		 *  velocidade fosse de 60km/h, em quanto tempo eu faria essa viagem ?
		*/	
		
		Scanner input = new Scanner(System.in);
		
		int velocidade1;
		int velocidade2;
		float tempoDaViagem;
		
		System.out.println("Informe grandeza Velocidade para 6 horas ");
		velocidade1 = input.nextInt();
		System.out.println("Informe a segunda velocidade para o calculo ");
		velocidade2 = input.nextInt();
		tempoDaViagem = (velocidade1*6)/velocidade2;
		
		System.out.println("Tempo total da viagem "+tempoDaViagem + " horas ");
		input.close();
	
	}

	
}
