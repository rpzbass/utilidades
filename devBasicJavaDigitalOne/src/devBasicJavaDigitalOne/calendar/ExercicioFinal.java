package devBasicJavaDigitalOne.calendar;

import java.util.Stack;

import devBasicJavaDigitalOne.classes.Orcamento;

public class ExercicioFinal {

	public static void main(String[] args) {
		
		/*Um cliente tem 10 dias para pagar uma fatura após
		 * sua data de vencimento sem que os juros sejam
		 * cobrados.
		 * Caso essa data caia em sábado ou domingo, o cliente
		 * pode pagar na segunda-feira seguinte.
		 * Crie uma estrutura que receba uma data de vencimento e calcule
		 * quantos dias ele tem para pagar
		 * */
		
		try {
			
			Orcamento orc = new Orcamento();
			System.out.println(orc.getValorTotal());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
