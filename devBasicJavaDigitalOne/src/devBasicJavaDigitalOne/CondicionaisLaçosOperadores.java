package devBasicJavaDigitalOne;

public class CondicionaisLa?osOperadores {

	public static void main(String[] args) {
		
		final var condicao = true;
		
		if(condicao) {
			System.out.println("A condi??o ? verdadeira");
		}else {
			System.out.println("A condi??o ? falsa");
		}
		if(condicao)
			System.out.println("Uma ?nica linha...");
		
		final var ternario = condicao ? "? verdadeira" : "? falsa";

		System.out.println(ternario);
		
		
		
	}

}
