package devBasicJavaDigitalOne;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.entrarNoCarro();
		carro.entrarNoCarro();
		carro.sairDoCarro();
		carro.sairDoCarro();
		carro.sairDoCarro();
	
		System.out.println(carro);
		
		for(int i = 1;i<=5;i++) {
		
			carro.entrarNoCarro();
		}
		
		carro.entrarNoCarro();
		
		
		
	}

}
