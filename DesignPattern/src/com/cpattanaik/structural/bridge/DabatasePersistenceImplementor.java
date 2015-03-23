package com.cpattanaik.structural.bridge;

public class DabatasePersistenceImplementor implements PersistenceImplementor {

	@Override
	public void save() {
		System.out.println("Persisted in Database");
		
	}

}
