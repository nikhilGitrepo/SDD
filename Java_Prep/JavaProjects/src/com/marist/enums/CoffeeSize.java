/**
 * 
 */
package com.marist.enums;

/**
 * @author Nikhil
 *
 */
public enum CoffeeSize {	
	SMALL(1),
	BIG(2),
	LARGE(3),
	EXTRALARGE(4);
	
	private int size;

	private CoffeeSize(int size) {
		this.size = size;
	}
	public int getWeight(){
		return size;
	}
}
