package devBasicJavaDigitalOne;

public class Operadores {

	
	public static void main(String[] args) {
		
		var numero = 11;	
		var numero2 = 0;	
		if(numero == 10) {
			
			System.out.println("O numero � 10");
			
		} else {
			
			System.out.println("O numero n�o � 10");
			
		}	
		if(numero != 10) {
			System.out.println("O numero n�o � 10");
		}else {
			System.out.println("O numero � 10");
		}
		var letra = "B";
			
		if("A".equals(letra)) {
			System.out.println("� a letra A");
		}
			
		if(!letra.equals("A")){
			
			System.out.println("N�o � a letra A");
			numero2 = 10;
			System.out.println(numero2--);
			System.out.println(numero2);
			
		}
		
		var x = 0;
		while(x<1) {
			System.out.println("While");
			x++;
		}
		var y = 0;
		do {
			System.out.println("Do While");
		}while(y++ < 1);
		
		
		
		
		
		
	}

}
