package devBasicJavaDigitalOne.classesTest;

import devBasicJavaDigitalOne.classes.Carro;
import devBasicJavaDigitalOne.classes.Moto;

public class CarroTest {

	public static void main(String[] args) {
		
		
		Carro carro = new Carro();
		
		carro.setValorVenal(15000.0);
		
		Moto moto = new Moto();
		
		moto.setValorVenal(15000.0);
		
	    System.out.println("Imposto moto: " + String.format("R$ %.2f",moto.calculaImposto()));
		System.out.println("Imposto carro: "+ String.format("R$ %.2f",carro.calculaImposto()));
		
		
		
		/*Moto moto = new Moto();
		
		System.out.println(moto.calculaImposto());
		*/
		
		

	}

}
