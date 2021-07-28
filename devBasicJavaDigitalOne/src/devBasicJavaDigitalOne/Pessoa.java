package devBasicJavaDigitalOne;

public class Pessoa {

	
	private String nome;
	private Double altura;
	private Double peso;
	private Double imc;
	private CalcPeso calcPeso = new CalcPeso();


	Pessoa(){
		
	}
	Pessoa(String nome,Double altura,Double peso){
		
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		
	}
	
	public void calcP(Pessoa pessoa) {
		
		this.imc = this.calcPeso.calcula(pessoa);
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getAltura() {
		return altura;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double getPeso() {
		return peso;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	@Override
	
	public String toString() {
		return "Pessoa [nome=" + nome + ", altura=" + altura + ", peso=" + peso 
				+"IMC :" + String.format("%.1f", imc) +"]";
				
	}
	
	
	
	
	
	
	
	
	
}
