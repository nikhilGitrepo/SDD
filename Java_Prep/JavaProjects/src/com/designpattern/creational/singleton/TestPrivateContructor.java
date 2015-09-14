package com.designpattern.creational.singleton;
public class TestPrivateContructor {

	public static void main(String[] args) {

		for(int i=0;i<5;i++){
		SingleTon instance = SingleTon.getInstance();
		System.out.println(instance.hashCode());
		}
		
	}

}

class SingleTon{

	private static SingleTon singleTonInstance = null;
	
	private SingleTon() {
	}
	
	public static SingleTon getInstance(){
		if(singleTonInstance == null){
			synchronized (SingleTon.class) {
				if(singleTonInstance == null){
					singleTonInstance = new SingleTon();
				}
			}
		}
		return singleTonInstance;
	}
	
}