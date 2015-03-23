package com.cpattanaik.behavioral.iterator;

public class Client {
	public static void main(String[] args){
	ICollection collection =  new IntCollection();
	
	collection.add(5);
	collection.add(6);
	collection.add(7);
	
	IIterator it = collection.iterator();
	
	while(it.hasNext()){
		System.out.println(it.next());
	}
  }

}
