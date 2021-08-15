package devBasicJavaDigitalOne.javaavancado;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClienteHttpTestII {

	public static void main(String[] args) {

		connectAndPrintURLJavaOracle();

	}

	private static void connectAndPrintURLJavaOracle() {

		HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create("https://www.mercadolivre.com.br/"))
				.build();

		HttpClient httpClient = HttpClient.newHttpClient();

		try {

			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

			System.out.println(response.body());

		} catch (IOException e) {

			e.printStackTrace();
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

}
