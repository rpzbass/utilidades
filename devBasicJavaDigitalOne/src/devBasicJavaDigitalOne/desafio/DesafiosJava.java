package devBasicJavaDigitalOne.desafio;

import java.util.Scanner;

public class DesafiosJava {

	public static void main(String[] args) {

		/*
		 * Domingo é dia de feira. Logo de manhã muitas pessoas se deslocam para o polo
		 * de lazer da Parangaba, onde acontece uma feira, conhecida por ser a maior da
		 * cidade. Na feira da Parangaba você pode encontrar de tudo. Todos os domingos,
		 * Bino faz compras na feira. Ele sempre marca com seu amigo Cino de se
		 * encontrarem no terminal de ônibus da Parangaba às 8h, para irem juntos
		 * comprar na feira. Porém, muitas vezes Bino acorda muito tarde e se atrasa
		 * para o encontro com seu amigo.Sabendo que Bino leva de 30 a 60 minutos para
		 * chegar ao terminal. Diga o atraso máximo de Bino.
		 */
		Scanner input = new Scanner(System.in);
		int atraso = 0;
		int minAux = 0;
		while (input.hasNext()) {

			String[] relogio = input.nextLine().split(":");
			int hora = Integer.parseInt(relogio[0]);
			int min = Integer.parseInt(relogio[1]);

			switch (hora) {
			case 7:
				atraso += (min - atraso);
				System.out.println("Atraso maximo: " + atraso);
				minAux = min;
				break;
			case 8:
				if (min == 0 && atraso != 0) {
					atraso += (60 - atraso);
				} else if (atraso == 0) {
					atraso = (60 - (60 - min)) + 60;
				} else if ((min - 1) != (minAux)) {
					atraso += (min - minAux);
				} else {
					atraso++;
				}
				System.out.println("Atraso maximo: " + atraso);
				minAux = min;
				break;
			case 9:
				if (min == 0 && atraso != 0) {
					atraso += (120 - atraso);
				} else if (atraso == 0) {
					atraso = 120;
				}
				System.out.println("Atraso maximo: " + atraso);
				break;
			default:
				System.out.println("Atraso maximo: 0");
			}

		}

		input.close();
	}

}