/**
 * 
 */
package com.designpattern.creational.singleton;

/**
 * @author Nikhil
 *
 */
public class DoubleCheckedSingleTon {
	
	private volatile DoubleCheckedSingleTon INSTANCE;

	private DoubleCheckedSingleTon() {
	}

	public DoubleCheckedSingleTon getInstance(){
		if(INSTANCE == null){
			synchronized (INSTANCE) {
				if(INSTANCE == null){
					
					INSTANCE = new DoubleCheckedSingleTon();
	
				}
			}
		}
		return INSTANCE;
	}

}
