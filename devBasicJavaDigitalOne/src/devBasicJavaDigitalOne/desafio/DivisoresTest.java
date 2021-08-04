package devBasicJavaDigitalOne.desafio;

import java.util.Scanner;

public class DivisoresTest {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		for(int i=N;i>=1;i--) {
			
			if(N % i == 0) {
				System.out.println( N / i);
			}
		}
		input.close();
	
	}

}
