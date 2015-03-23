package com.cpattanaik.creational.objectpool;

import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class ObjectPool<T> {
  private ConcurrentLinkedQueue<T> queue = new ConcurrentLinkedQueue<T>();
  
  ObjectPool(long poolSize){
	  for(int i=0; i<poolSize; i++){
		  queue.add(create());
	  }
  }
  
  //This method will be implemented in actual object class
  public abstract T create();
  
  public T checkOut(){ 
	  T obj = queue.poll();
	  if( obj == null)
		  obj = create();
	  return obj;
  }
  
  public void checkIn(T obj){
	  if(obj != null){
		queue.offer(obj);
	  }
 }
  
}
