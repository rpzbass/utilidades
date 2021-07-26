package devBasicJavaDigitalOne;

public class StringBuilder {

	public static void main(String[] args) {
		
		String nome = "Ronald";
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("A B C D E F G".toCharArray());
		
		String alfabeto = "A B C D E F G";
		
		char [] arraydeChar = alfabeto.toCharArray();
		
		for(char teste : arraydeChar) {
			System.out.print(teste);
		}

		System.out.println("Aula de Java".split(" ")); 
		
		String frase = "Aula de Java";
		
		String[] novaFrase = frase.split(" "); /* retorna um array por meio de delimitador */
		
		for(String line : novaFrase) {
			System.out.print(line);
		}
		
		System.out.println(frase.concat(" mais concatenação ")); /* concatena frases */
		
		System.out.println(frase.replaceAll("a","e")); /*Substitui as ocorrencias a por e */
		
		
	
	}

}
