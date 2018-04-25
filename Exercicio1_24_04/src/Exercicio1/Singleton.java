package Exercicio1;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable{

	private static final long serialVersionUID = -1093810940935189395L;
	private static Singleton sc = new Singleton();
	private Singleton(){
		if(sc!=null){
			throw new IllegalStateException("Already created.");
		}
	}
	public static Singleton getInstance(){
		return sc;
	}
	public static void Incremental() {
		
		for (int i = 0; i < 10; i++) {
		
			
			System.out.println("Icremental " + (i+1));
		}
		
	}
	
}
