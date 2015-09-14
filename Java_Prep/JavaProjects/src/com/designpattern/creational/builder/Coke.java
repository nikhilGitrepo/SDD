package com.designpattern.creational.builder;

public class Coke extends ColdDrinks {

	@Override
	public String name() {
		return "COKE";
	}

	@Override
	public Float price() {
		return 2f;
	}

}
