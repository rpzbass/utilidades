package devBasicJavaDigitalOne.bc2;

import java.util.Scanner;

public class Tweet {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String T = input.nextLine();
		
	
		System.out.println(T.length() > 140 ? "MUTE" : "TWEET");
		
		
		
		 input.close();
	}

}
