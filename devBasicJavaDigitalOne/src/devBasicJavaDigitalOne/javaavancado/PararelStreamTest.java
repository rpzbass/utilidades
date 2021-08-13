package devBasicJavaDigitalOne.javaavancado;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PararelStreamTest {

	public static void main(String[] args) {

		long inicio = System.currentTimeMillis();
		IntStream.range(1, 1000).forEach(num ->  fatorial(num));
		long fim = System.currentTimeMillis();
		System.out.println("Tempo de execução: " + (fim - inicio));

		List<String> names = Arrays.asList("Joao","Paulo","Oliveira","Santos");
		names.parallelStream().forEach(System.out::println);	
	
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
