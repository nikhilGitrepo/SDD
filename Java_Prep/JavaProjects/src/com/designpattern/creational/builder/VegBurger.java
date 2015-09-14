/**
 * 
 */
package com.designpattern.creational.builder;

/**
 * @author Nikhil
 *
 */
public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public Float price() {
		return 1f;
	}

}
