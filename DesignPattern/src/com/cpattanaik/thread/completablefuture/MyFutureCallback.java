/**
 * 
 */
package com.cpattanaik.thread.completablefuture;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.util.EntityUtils;

/**
 * @author c0p00fy
 *
 */
public class MyFutureCallback<T> implements FutureCallback<HttpResponse> {

	/**
	 * @param response
	 */
	private MyResponse response;
	public MyFutureCallback(MyResponse response) {
		this.response = response;
	}

	
	@Override
	public void completed(HttpResponse result) {
		try {
			HttpEntity entity = result.getEntity();
			response.setContent(EntityUtils.toString(entity, "UTF-8"));
			response.setStatusCode(result.getStatusLine().getStatusCode());
		} catch (Exception e) {
			e.printStackTrace();
		};
	}

	
	@Override
	public void failed(Exception ex) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.apache.http.concurrent.FutureCallback#cancelled()
	 */
	@Override
	public void cancelled() {
		// TODO Auto-generated method stub

	}

}
