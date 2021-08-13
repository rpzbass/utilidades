package devBasicJavaDigitalOne.javaavancado;

import java.util.function.Function;

public class NomeAoContrario {

	public static void main(String[] args) {
		
		Function<String,String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
		
		System.out.println(retornaNomeAoContrario.apply("ana"));
		
		
		

	}

}
