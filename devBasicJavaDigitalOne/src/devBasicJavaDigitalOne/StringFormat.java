package devBasicJavaDigitalOne;

public class StringFormat {

	public static void main(String[] args) {

		
		var nome = "PrimeiroNome";
		var sobreNome = "SegundoNome";
		
		final var nomeCompleto = nome + " " + sobreNome;
		System.out.println(nomeCompleto);
		
		System.out.println(nome);
		System.out.println("Nome do cliente : "+ nome);
		System.out.println("Nome completo do cliente: "+ nomeCompleto);
		
		
		
		final var mensagem = String.format("O Cliente %s possui sobre nome %s", nome, sobreNome);
		System.out.println(mensagem);
		double valor = 1.2375d;
		System.out.println(String.format("Numero %.2f", valor));
		
		
		

	}

}
