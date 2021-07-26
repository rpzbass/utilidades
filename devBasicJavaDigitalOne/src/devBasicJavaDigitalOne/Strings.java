package devBasicJavaDigitalOne;

public class Strings {

	public static void main(String[] args) {
		
		var nome = "joaodascoves";  /*Modo indeferido, compilador faz a inicialização da tipagem 
		 denominado autoboxing */
		var sobreNome = "gomes"; 
		final var nomeCompleto = nome + " " + sobreNome;
		System.out.println(nome);
		System.out.println("Nome do cliente"+ nome);
		System.out.println("Nome completo do cliente"+ nomeCompleto);
		
		var string = new String(" Minha Frase ");
		System.out.println(nomeCompleto+ " "+ string);
		System.out.println("Char na posição: " + string.charAt(2));
		System.out.println("Quantidade: " +string.length());
		System.out.println("Sem Trim ["+string +"]");
		System.out.println("Com Trim ["+string.trim()+"]");
		System.out.println("Lower "+ string.toLowerCase());
		System.out.println("Upper "+ string.toUpperCase());
		System.out.println("Contém M? "+ string.contains("M"));
		System.out.println("Contém X? "+ string.contains("X"));
		System.out.println("Replace " + string.replace("F", "T"));
		System.out.println("Equals? "+ string.equals(" Minha Frase "));
		System.out.println("EqualsIgnoreCase?" + string.equalsIgnoreCase(" Minha frase "));
		System.out.println("Substring(1,6)="+ string.substring(1, 6));
		
		
		
		
		
		

	}

}
