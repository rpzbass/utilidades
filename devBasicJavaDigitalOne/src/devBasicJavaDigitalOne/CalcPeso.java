package devBasicJavaDigitalOne;

public class CalcPeso {
	public CalcPeso() {
		
	}
	
	public Double calcula(Pessoa pessoa) {
	
		return  pessoa.getPeso() / (pessoa.getAltura()*pessoa.getAltura()); 	
	}
	
	
	
}
