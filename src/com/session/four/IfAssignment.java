package com.session.four;
import java.util.*;
public class IfAssignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number a :");
		int a =sc.nextInt();
		System.out.println("Enter the number b");
		int b =sc.nextInt();
		System.out.println("Enter the number c");
		int c =sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println("a is greater among the three number");
		}
			else {
				System.out.println("a is not greater than among three number");
				sc.close();
			}
			}
		}
		



