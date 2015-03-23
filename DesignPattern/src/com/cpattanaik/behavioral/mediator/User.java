package com.cpattanaik.behavioral.mediator;

public class User {
    private Mediator m = null;
    String name = null;
	public User(Mediator m, String name) {
		this.m = m;
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
    public void sendMessage(User user, String msg){
    	m.send(this, user, msg);
    }
    
    public void recieveMessage(User user, String msg){
    	System.out.println(this.name + "] Message from "+ user.getName() + " : " + msg);
    }
    
}
