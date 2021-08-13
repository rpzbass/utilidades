package devBasicJavaDigitalOne.javaavancado;

import java.util.function.Supplier;

public class Suplidores {

	public static void main(String[] args) {
		
		
		Supplier<Pessoa> suppliers = () -> new Pessoa("Ana",25);
		System.out.println(suppliers.get());
	
	
		
	}

}

class Pessoa {
	
	private String nome;
	private Integer idade;
	

	public Pessoa(String nome,Integer idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	@Override
	public String toString() {
		return String.format("\sNome: "+nome +"\n Idade: "+idade);
	}
}
