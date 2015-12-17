package com.singleton;

public class Singleton {

	private static Singleton instance = null;
	
	private Singleton(){
		
	}
	
	private static synchronized void synvInit(){
		if(instance == null){
			instance = new Singleton();
		}
	}
	
	public Singleton getInstance(){
		if(instance == null){
			synvInit();
		}
		return instance;
	}
}
