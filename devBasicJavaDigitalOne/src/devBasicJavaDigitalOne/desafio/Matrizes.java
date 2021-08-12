package devBasicJavaDigitalOne.desafio;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		double[][] matriz = new double[4][4];
		double a = 0.0;
		char opcao;
		int c, x, y, z, p = 11, r = 7;
		
		Scanner input = new Scanner(System.in);

		opcao = input.next().toUpperCase().charAt(0);

		for (x = 0; x < matriz.length; x++) {

			for (y = 0; y < matriz.length; y++) {

				matriz[x][y] = input.nextDouble();

			}
		}
		
		
		for (z = 1; z <= 10; z++) {

			if (z <= 5) {

				for (c = p; c <= 11; c++) {

					a += matriz[z][c];
					p--;
				}
			} else if (z >= 6) {

				for (c = r; c <= 11; c++) {

					a += matriz[z][c];
					r++;
				}
			}

		}

		if (opcao == 'S') {

			System.out.printf("%.1f\n", a);

		} else if (opcao == 'M') {

			a = a / 30.0;
			System.out.printf("%.1f\n", a);
		}
		
		input.close();
	}

}
