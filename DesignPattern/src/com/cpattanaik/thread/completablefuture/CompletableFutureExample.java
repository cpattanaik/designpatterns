/**
 * 
 */
package com.cpattanaik.thread.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;

/**
 * @author c0p00fy
 *
 */
public class CompletableFutureExample {
	private static ThreadPoolExecutor executorSink = (ThreadPoolExecutor) Executors.newFixedThreadPool(20);
	private static ThreadPoolExecutor executorSource = (ThreadPoolExecutor) Executors.newFixedThreadPool(20);
	private static ThreadPoolExecutor executorMap = (ThreadPoolExecutor) Executors.newFixedThreadPool(20);
	private static ThreadPoolExecutor executorHandle = (ThreadPoolExecutor) Executors.newFixedThreadPool(20);

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		for(int i = 0; i<100; i++){
//			Supplier<String> supplier = new MySuplier(String.valueOf(i));
//			func(supplier);
			
			CloseableHttpAsyncClient client = HttpAsyncClients.createDefault();
			client.start();
			MyResponse myResponse = new MyResponse();
			String path = "https://www.amazon.com/dp/B076MPMZDV/ref=dp_cerb_1";
			
//			Supplier<MyResponse> supplierAsync = new MySuplierAsync(path, client, myResponse);
//			funcAsync(supplierAsync);
//			
			CompletableFuture<HttpResponse> response = getDataAsync(path, client);
			response.thenAcceptAsync(new Consumer<HttpResponse>() {
				@Override
				public void accept(HttpResponse response) {
					System.out.println(response.getEntity());   
				}
			}, executorSink);
		}
	}
	
	
	/**
	 * @param supplierAsync
	 */
	private static void funcAsync(Supplier<MyResponse> supplierAsync) {
		CompletableFuture<MyResponse> futureSource = CompletableFuture
				.supplyAsync(supplierAsync, executorSource);
		
		futureSource.thenAcceptAsync(new Consumer<MyResponse>() {
			@Override
			public void accept(MyResponse response) {
				System.out.println(response.getContent());   
			}
		}, executorSink);
	}
	
	
	static CompletableFuture<HttpResponse> getDataAsync(String path, CloseableHttpAsyncClient client){
	    final CompletableFuture<HttpResponse> promise = new CompletableFuture<>();
	    HttpGet request = new HttpGet(path);
	    client.execute(request, new FutureCallback<HttpResponse>() {
					@Override
					public void completed(HttpResponse result) {
						promise.complete(result);
					}
					
					@Override
					public void failed(Exception ex) {
						promise.completeExceptionally(ex);
						
					}
					
					@Override
					public void cancelled() {
						
					}
	            });
	    return promise;
	}



	@SuppressWarnings("unused")
	private static void func(Supplier<String> supplier) throws InterruptedException, ExecutionException {
		CompletableFuture<String> futureSource = CompletableFuture
				.supplyAsync(supplier, executorSource);
				
		futureSource.handleAsync(new BiFunction<String, Throwable, Object>() {
			@Override
			public Object apply(String res, Throwable ex) {
				if(ex != null) {
			        System.out.println("Oops! We have an exception");
			        return "Unknown!";
			    }
			    return res;
			}
		}, executorHandle);
		
		futureSource.thenApplyAsync(new Function<String, Object>() {
			@Override
			public Object apply(String name) {
				return "Final " + name ;
			}
		}, executorMap);
		
		futureSource.thenAcceptAsync(new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println(name);   
			}
		}, executorSink);
	}
}
