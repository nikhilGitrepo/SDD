package com.designpattern.creational.builder;

public abstract class ColdDrinks implements Item {

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract Float price();

}
