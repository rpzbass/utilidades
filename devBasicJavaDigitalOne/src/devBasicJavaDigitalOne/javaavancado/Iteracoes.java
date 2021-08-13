package devBasicJavaDigitalOne.javaavancado;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

	public static void main(String[] args) {
		
		String []  nomes = {"Joao","Paulo","Oliveira","Santos","Instrutor","Java"};
		Integer [] numeros = {1,2,3,4,5};
		
		//imprimirNomesFiltrados(nomes);
		
		String nomesDaStream = Stream.of(nomes)
			.filter( x-> x.equals("Joao"))
			.collect(Collectors.joining());
		
		/*
		Stream.of(nomes).forEach(n -> System.out.println(n));
		System.out.println(nomesDaStream);
		*/
		imprimirTodosOsNomes(nomes); 
		
		/* Converter array em lista, ler apartir do nomes proposto, e imprimir esses nomes */
		Arrays.asList(nomes)
			.stream()
			.filter(nome -> nome.startsWith("Oliveira"))
			.forEach(System.out::println);
		
		
		
		
	
	}

	public static void imprimirNomesFiltrados(String... nomes) {
		
		String nomesParaImprimir = "";
		for(int i=0;i<nomes.length;i++) {
			
			if(nomes[i].equals("Joao")) {
				nomesParaImprimir+=" "+nomes;
			}	
		}
	
	}
	
	public static void imprimirTodosOsNomes(String... nomes) {
		Stream.of(nomes).forEach(System.out::println);
	}
	
	
	
	
	
	
	
}
