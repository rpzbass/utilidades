package devBasicJavaDigitalOne.javaavancado;

import java.util.stream.IntStream;

public class PararelStreamTest {

	public static void main(String[] args) {

		long inicio = System.currentTimeMillis();
		IntStream.range(1, 100000).forEach(num ->  fatorial(num));
		long fim = System.currentTimeMillis();
		System.out.println("Tempo de execução: " + (fim - inicio));

	}

	public static long fatorial(long num) {

		long fat = 1;
		
		for (long i = 2; i <= num; i++) {
			System.out.println("Executando:");
			fat *= i;
		}

		return fat;
	}

}
