package com.cpattanaik.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class ObjectPool<T> {
	private BlockingQueue<T> queue = new LinkedBlockingQueue<T>();
    private long poolSize = 0;
	ObjectPool(long poolSize)  {
		this.poolSize = poolSize;
		for (int i = 0; i < poolSize; i++) {
			try {
				queue.put(create());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// This method will be implemented in actual object class
	public abstract T create();

	public T checkOut() throws InterruptedException {
		T obj = queue.take();
		if (obj == null) {
			obj = create();
		}
		return obj;
	}

	public void checkIn(T obj) throws InterruptedException {
		if (obj != null && queue.size() < poolSize-1) {
			queue.put(obj);
		}
	}
}
