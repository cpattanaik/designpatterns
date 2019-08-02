/**
 * 
 */
package com.cpattanaik.thread.completablefuture;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.util.EntityUtils;

/**
 * @author c0p00fy
 *
 */
public class MySuplierAsync implements Supplier<MyResponse> {
	private CloseableHttpAsyncClient client ;
	private String value = "";
	private MyResponse myResponse;
	public MySuplierAsync(String value, CloseableHttpAsyncClient client, MyResponse myResponse) {
		this.value =  value;
		this.client = client;
		this.myResponse = myResponse;
	}
	
	@Override
	public MyResponse get() {
		HttpGet request =   new HttpGet(value);
		MyFutureCallback<HttpResponse> callabck = new MyFutureCallback<HttpResponse>(myResponse);
	    client.execute(request, callabck);
	    return (MyResponse) myResponse;
	}
}
