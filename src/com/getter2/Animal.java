package com.getter2;

public class Animal {
 private String animalName;
 private String animalType;
 private int noOfLegs;
 
 void animalName(String animalName) {
	 this.animalName= animalName;
 }
 void setanimalType(String animalType) {
	 this.animalType= animalType;
 }
 void setnoOfLegs(int noOfLegs) {
	 this.noOfLegs= noOfLegs;
 }
 String getanimalType() {
	 return this.animalType;
 }
 int getnoOfLegs() {
	 return this.noOfLegs;
 }

String getanimalName() {
	 return this.animalName;
}
 
 void walks() {
	 System.out.println("started walking");
 }
 void eats() {
	 System.out.println("Started eating ");
 }
 void makesSound() {
	 System.out.println("Started making sound");
 }
}

