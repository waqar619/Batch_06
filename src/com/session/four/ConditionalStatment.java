
package com.session.four;
import java.util.*;

public class ConditionalStatment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number a");
		int a = sc.nextInt();
		System.out.println("Enter the number b");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println("Number a is greater than b");
		}
			else {
				System.out.println("Number b is greater than a");
				sc.close();
		}

	}

}
