package devBasicJavaDigitalOne.javaavancado;

import java.util.function.Consumer;

public class Consumidores {

	public static void main(String[] args) {
		
		Consumer<String> imprimirUmaFrase = param -> System.out.println(param); 
		imprimirUmaFrase.accept("Hello World");
		
		Consumer<String> imprimirUmaFraseII = System.out::println;
		
		imprimirUmaFraseII.accept("Hello World Forma implicita");
		

	}

}
