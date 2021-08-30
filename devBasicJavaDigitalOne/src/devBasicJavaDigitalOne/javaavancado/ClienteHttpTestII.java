package devBasicJavaDigitalOne.javaavancado;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

public class ClienteHttpTestII {

	static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {

		@Override
		public Thread newThread(Runnable r) {
			// TODO Auto-generated method stub

			Thread thread = new Thread(r);

			System.out.println("Nova Thread criada : " + (thread.isDaemon() ? "daemon" : "") + "Thread Group : "
					+ thread.getThreadGroup());

			return thread;
		}

	});

	public static void main(String[] args) {

		// connectAndPrintURLJavaOracle();
		connectAkamaHttpClient();

	}

	private static void connectAkamaHttpClient() {

		System.out.println("Running HTTP/1.1 example");

		try {
			HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1)
					.proxy(ProxySelector.getDefault()).build();

			long start = System.currentTimeMillis();

			HttpRequest mainRequest = HttpRequest.newBuilder()
					.uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html")).build();

			HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

			System.out.println("Status Code ::: " + response.statusCode());
			System.out.println("Response Headers :::" + response.headers());
			String responseBody = response.body();
			System.out.println(responseBody);

			List<Future<?>> future = new ArrayList<>();

			responseBody.lines().filter(line -> line.trim().startsWith("<img height"))
					.map(line -> line.substring(line.indexOf("src=") + 6, line.indexOf("'/>"))).forEach(img -> {

						Future<?> imgFuture = executor.submit(() -> {

							HttpRequest imgRequest = HttpRequest.newBuilder()
									.uri(URI.create("https://http2.akamai.com" + img)).build();
							try {
							
								httpClient.send(imgRequest, HttpResponse.BodyHandlers.ofString());
								System.out.println("imagem Carregada: "+ img +",status code");
							
							} catch (IOException e) {

								e.printStackTrace();

							} catch (InterruptedException e) {
								
								e.printStackTrace();
							
							}
						});
						future.add(imgFuture);
						System.out.println("Submetido um futuro para imagem"+img);
					});
				
					future.forEach(f-> {
						
						try {
							f.get();
							
						}catch(InterruptedException e) {
							e.printStackTrace();
						}catch(ExecutionException e) {
							e.printStackTrace();
						}
						
						
					});
			
			
			long end = System.currentTimeMillis();
			
			System.out.println("Tempo : "+ (end-start) + "ms");

		} catch (InterruptedException e) {
			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	private static void connectAndPrintURLJavaOracle() {

		HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create("https://www.google.com")).build();

		HttpClient httpClient = HttpClient.newHttpClient();

		try {
			System.out.println("Loading...\n");
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

			System.out.println("Status code: " + response.statusCode());
			System.out.println("Headers response: " + response.headers());
			System.out.println(response.body());

		} catch (IOException e) {

			e.printStackTrace();

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

	}

}
