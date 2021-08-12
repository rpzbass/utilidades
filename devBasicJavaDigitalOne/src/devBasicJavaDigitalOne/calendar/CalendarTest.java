package devBasicJavaDigitalOne.calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		String [][] matriz = new String[10][10];
		
		
		
		for(int i=0;i<matriz.length;i++) {
			
			for(int j=0;j<matriz.length;j++) {
			
				if(j<=i) {
					
					System.out.print(" * ");
				
				}else {
					System.out.print(" # ");
				}
				
				
				
			}
			System.out.println();
		}
		
		
		

		
	
		
		
		
	}

}
