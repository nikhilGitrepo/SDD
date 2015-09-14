/**
 * 
 */
package com.designpattern.creational.singleton;

/**
 * @author Nikhil
 *
 */
public class StaticFinalSingleton {

	//instance created when the class is loadedze
	private static final StaticFinalSingleton INSTANCE = new StaticFinalSingleton();
	
	public StaticFinalSingleton() {
	}
	public StaticFinalSingleton getSingleToFinalSingleton(){
		return INSTANCE;
	}
}
