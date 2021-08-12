package devBasicJavaDigitalOne.paradigmafunc;

import java.util.function.UnaryOperator;

public class Lambda {

	public static void main(String[] args) {
		/*Lambda e interface funcional */
		int valor = 3;
		UnaryOperator<Integer> retornarDobro = v -> v % 2 == 0 ? 2 : 1;
		System.out.println(retornarDobro.apply(valor));
		
		//Funcao1 funcao = n -> n;
				
		//Funcao concatenaPrefixo = v -> "Sr "+v; /* Com retorno */
		//System.out.println(concatenaPrefixo.gerar("Gomes")); 
		
		
		
		
		
		

	}

}

	




interface Fat {
	
	int fatorial(Integer valor);
	
	
	
	
}

