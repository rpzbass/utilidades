package devBasicJavaDigitalOne.bc2;

import java.util.Scanner;

public class HoraTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int seg = input.nextInt();
		
		int hour = seg / 3600;
			
		int min = (seg % 3600)/60;
		
		seg = (seg % 3600)% 60;
		
		
		System.out.println(hour+":"+min+":"+seg);
		
		input.close();
	}

}
