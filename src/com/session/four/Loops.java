package com.session.four;

public class Loops {

	public static void main(String[] args) {
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");
//		System.out.println("6");
//		System.out.println("7");
//		System.out.println("8");
//		System.out.println("9");
//		System.out.println("10");
//		
		//Three types 
		//while
		//do while
		// for
		
		/*
		  while (condition) {
		  termination condition 
		 }
		 */
		
		int i = 1; //intialization
		
		while(i <= 10) { // condition check 
			System.out.println(i);
			i = i + 1;
		}
		
//		/*
//		do {
//			//statment
//			* increment 
//		}

	
	
	int j = 2;
	do {
		System.out.println(j);
		
		j =j + 2;
		
	}while(j<=20);
	
	//difference
	int k = 20;
	while (k <= 10) {
		System.out.println("Hi while");
	}	
	
	/*
	 *  for(intialization; condition check; increment/decrement){
	 *  }
	 */
	
	int index;
	
	for (index =1; index <=10; index =index) {
		System.out.println(index);
	}
	 System.out.println("Out of for loop");
	 
	 // continue
	 System.out.println("continue example");
	 for(index = 10; index <= 20; index = index + 1) {
		 if(index == 15) {
			 continue;
		 }
		 System.out.println(index + " ");
	 }
	 System.out.println("break example");
	 //break;
	 for(index= 100; index <= 1000; index = index + 1) {
		 System.out.println(index + " ");
		 if(index == 105) {
			 break;
		 }
	 }
	 
	 System.out.println();
	 
	 //array
	 
	 int intArray[] = {101, 102, 103, 105};
	 
//	 int intArray[] = {101, 102, 103, 105}
//	 index              0    1    2    3	
//	 intArray[1] -> 102
//	 intArray[3]
	 
//	 System.out.println("element at index 0 is " + intArray[0]);
//	 System.out.println("element at index 1 is " + intArray[1]);
//	 System.out.println("element at index 2 is " + intArray[2]);
//	 System.out.println("element at index 3 is " + intArray[3]);
		
	// System.out.println("Array length is " + intArray.length);
	 
	 
	 for(int ii = 0; ii <= 3; ii++) {
		 System.out.println("element at index " +ii+" is "+ intArray[ii]);
		 
	 }
	 System.out.println("Array length is " + intArray.length);
	 for(int ii = 0; ii < intArray.length; ii++) {
		 System.out.println("element at index " + ii +" is " +intArray[ii]);
		 
		 
	 }
	}
}
		 
	 
	

	
	
	
	

