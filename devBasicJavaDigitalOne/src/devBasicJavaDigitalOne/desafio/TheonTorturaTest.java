package devBasicJavaDigitalOne.desafio;

import java.math.BigDecimal;
import java.util.Scanner;

public class TheonTorturaTest {

	public static void main(String[] args) {
	/*
		
		Scanner entrada = new Scanner(System.in);
		
		int numPessoas = entrada.nextInt(); /*Numero de pessoas
		int [] castigo = new int[numPessoas];
		 int  posicao = 0;
		 int menorValor=0, posMenor=0;
	
		for(int i=0;i<castigo.length;i++) {
			castigo[i] = entrada.nextInt();
		}
		menorValor=castigo[0];
		
		for(int i=0;i<castigo.length;i++) {	
			
			if(castigo[i] < menorValor) {
				menorValor = castigo[i];
				posMenor =i;
			}
			
			
		}
		System.out.print(posicao);
		entrada.close();
		*/
		Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int[] X = new int[N];
        int menor = 0, posMenor = 0;

        for (int i = 0; i < N; i++) {
        	X[i] = leitor.nextInt();

        	if (i == 0) {
        		menor = X[i];
        		posMenor = i+1;
        	} else if (X[i] < menor) {
        		menor = X[i];
        		posMenor = i+1;
        	}
        }
        System.out.println("Posicao: " + posMenor); //complete o codigo aqui de acordo com a variavel esperada
    
        leitor.close();
	
	
	}


}
