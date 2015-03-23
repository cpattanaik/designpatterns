package com.cpattanaik.structural.bridge;

import java.io.IOException;

public class Client {
	public static void main(String[] args) throws IOException{
		
		Persitance api =  new PersitanceImpl();
		api.persist();
	}

}
