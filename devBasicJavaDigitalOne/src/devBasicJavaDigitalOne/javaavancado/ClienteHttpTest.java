package devBasicJavaDigitalOne.javaavancado;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class ClienteHttpTest {

	public static void main(String[] args) {
		
			connectAndPrintURLJavaOracle();

	}
	private static void connectAndPrintURLJavaOracle() {
		
		try {
			
			var url = new URL("https://www.google.com");
			var urlConnection = url.openConnection();
			
			try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
				
				System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	

}
