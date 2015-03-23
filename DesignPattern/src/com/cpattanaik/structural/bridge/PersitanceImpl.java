package com.cpattanaik.structural.bridge;

import java.io.IOException;
import java.util.Properties;

public class PersitanceImpl implements Persitance {
	private PersistenceImplementor implementor = null;
	
	public PersitanceImpl() throws IOException {
		Properties configFile = new Properties();
		configFile.load(PersitanceImpl.class.getClassLoader().getResourceAsStream("project.properties"));
		String value = configFile.getProperty("bridge.implementor");
		
		if(value.equals("db")){
			implementor = new DabatasePersistenceImplementor();	
		}else if(value.equals("file")){
			implementor = new FileSystemPersistenceImplementor();
		}
	}

	@Override
	public void persist() {
		implementor.save();
		
	}

}
