package com.session.four;
import java.util.*;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number");
		int a = sc.nextInt();
		if(a >= 70) {
			System.out.println("Distinction");
		}
		else if(a>= 60) {
			System.out.println("Grade A");
		}
		else if(a>=45) {
			System.out.println("Grade B");
		}
		else if(a>=35) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Grade D");
		}
		sc.close();

	}

}
