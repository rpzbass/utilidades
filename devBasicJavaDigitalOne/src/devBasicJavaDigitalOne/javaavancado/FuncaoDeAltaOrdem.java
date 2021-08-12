package devBasicJavaDigitalOne.javaavancado;

public class FuncaoDeAltaOrdem {

	public static void main(String[] args) {
		
		Calculo soma = ( a,b ) -> a+b;
			
		System.out.println(executarOperacao(soma,2,2));
		
		

	}

	public static int executarOperacao(Calculo calculo, int a, int b) {
		return calculo.calcular(a, b);
	}
	
	
}
@FunctionalInterface
interface Calculo {
	
	public int calcular(int a,int b);
	
	
}