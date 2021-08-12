package devBasicJavaDigitalOne.desafio;

import java.util.Arrays;
import java.util.Scanner;

public class SplitTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		String [] cpf = "00.000.000-000".split("\\.|-");
		
		
		for(int i=0;i<cpf.length;i++) {
			
			System.out.println(cpf[i]);
			
		}
		

		input.close();
		
		
		
		
		
		

	}

}
