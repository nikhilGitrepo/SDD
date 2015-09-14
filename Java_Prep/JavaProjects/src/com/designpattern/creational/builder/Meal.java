package com.designpattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
 private List<Item> items = new ArrayList<Item>();
 
 	public void addItem( Item item){
 		items.add(item);
 	}
 
 	public float getCost(){
 		float cost = 0.0f;
 		for(Item i : items){
 			cost = cost + i.price();
 		}
 		return cost;
 	}
 	
 	public void displayItems(){
 		int itemNumber = 1;
 		for(Item i : items){
 			System.out.println("Name of Meal item " + itemNumber + " : " + i.name());
 			System.out.println("Packing of Meal item " + itemNumber + " : " + i.packing().pack());
 			System.out.println("Cost of Meal item " + itemNumber + " : " + i.price());
 			System.out.println("----------------------------------------------------");
 			++itemNumber;
 		}
 	}
}
