package devBasicJavaDigitalOne.bc2;

import java.util.Locale;
import java.util.Scanner;

public class MediaTest {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double nota1, nota2, media = 0;

		while (media == 0) {
			System.out.println("nota1");
			nota1 = input.nextDouble();

			if (nota1 < 0 || nota1 > 10) {

				System.out.println("nota invalida");

			} else {
				while (media == 0) {

					System.out.println("nota2");
					nota2 = input.nextDouble();

					if (nota2 < 0 || nota2 > 10) {

						System.out.println("nota invalida2");

					} else {

						media = (nota1 + nota2) / 2;
						System.out.println("media =" + media);
						
					}
				}
			}

		}

		input.close();

	}

}
