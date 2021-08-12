package devBasicJavaDigitalOne.desafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ListaCidade {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Map<Integer, String> cidades = new HashMap<>();

		int ddd = input.nextInt();
		boolean result = false;

		cidades.put(61, "Brasilia");
		cidades.put(71, "Salvador");
		cidades.put(11, "Sao Paulo");
		cidades.put(21, "Rio de Janeiro");
		cidades.put(32, "Juiz de Fora");
		cidades.put(19, "Campinas");
		cidades.put(27, "Vitoria");
		cidades.put(31, "Belo Horizonte");
		cidades.put(41, "Curitiba");
		for (Entry<Integer, String> line : cidades.entrySet()) {

			if (ddd == line.getKey()) {
				System.out.println(line.getValue());
				return;
			} else {
				result=true;
			} 
		}

		if (result) {
			System.out.println("DDD nao cadastrado");
		}
		input.close();

	}

}
