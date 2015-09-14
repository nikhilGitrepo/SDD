/**
 * 
 */
package com.designpattern.creational.builder;

/**
 * @author Nikhil
 *
 */
public class Wrapper implements Packing {

	/* (non-Javadoc)
	 * @see com.designpattern.creational.builder.Packing#pack()
	 */
	@Override
	public String pack() {
		return "Wrapped";
	}

}
