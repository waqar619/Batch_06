package com.getter2;

public class AnimalName {

	public static void main(String[] args) {
	Animal cow = new Animal();
//	Animal dog = new Animal();
//	Animal cat = new Animal();
	
     cow.setanimalType("Domestic Animal");
     System.out.println("Cow is a : " +cow.getanimalType());
     cow.setnoOfLegs(4);
     System.out.println("It has total leg : " +cow.getnoOfLegs());

	}

}
