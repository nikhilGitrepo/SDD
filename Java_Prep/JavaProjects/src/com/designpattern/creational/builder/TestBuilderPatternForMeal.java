package com.designpattern.creational.builder;

public class TestBuilderPatternForMeal {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();
		Meal meal = mealBuilder.prepareVegMeal();
		meal.displayItems();
		
		System.out.println("----------------------------------------------------");
		System.out.println("Total Cost of Meal is  : " + meal.getCost());
		
	}

}
