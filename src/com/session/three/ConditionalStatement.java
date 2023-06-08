package com.session.three;

public class ConditionalStatement {

	public static void main(String[] args) {
		int a = 15;
		int b = 12;
		// operator 
		// > < == !=
		
		if (a > b) {
			//true
			System.out.println(a + " is greater");
		}else {
			//false
			System.out.println(b + "is greater");
			
		}
		/*
		 *  int x= 2, y = 5 , z = 1;
		 *  
		 *  if() {
		 *  
		 *  }else if () {
		 *  
		 *  }else if () {
		 *  
		 *  }
		 */
		
		int x = 5;
		
		switch (x) {
		case 1:
			System.out.println(" It is one");
			break;
		case 2:
			System.out.println(" It is two");
			break;
		case 3:
			System.out.println(" It is three");
			break;	
			
			default:
				System.out.println("Unexpected value: " + x);
		}
		
		String key = "key";
		switch (key) {
		case "key": {
			
			System.out.println("key");
		}
		break;
		default:
			System.out.println("Unexpected value: " + key);
		}

	}

}
