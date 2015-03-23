package com.cpattanaik.structural.bridge;

public class FileSystemPersistenceImplementor implements PersistenceImplementor {

	@Override
	public void save() {
		System.out.println("Persisted in File");
		
	}

}
