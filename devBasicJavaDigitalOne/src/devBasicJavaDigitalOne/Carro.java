package devBasicJavaDigitalOne;

public class Carro {

	private Integer quantidade;
	

	{
		this.quantidade = 0;
	}

	public Carro() {
		
	}
	
	public Carro(Integer quantidade) {
		this.quantidade = quantidade;
	
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public void sairDoCarro() {
		
		if(quantidade>=1) {
			quantidade--;
		}else {
			System.out.println("Carro vazio");
		}
	}
	
	public void entrarNoCarro() {
		
		if(quantidade<=4) {
			quantidade++;
		}else {
			System.out.println("Carro lotado");
		}	
	}
	
	@Override
	public String toString() {
		return "Carro [quantidade=" + quantidade + "]";
	}
	
}
