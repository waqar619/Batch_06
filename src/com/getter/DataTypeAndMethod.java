   package com.getter;

public class DataTypeAndMethod {

	public static int multiply(int x,int y) {
		int mul;
		mul= x* y;
		return mul;
	}
	public static int addition(int x,int y) {
		int add;
		add= x + y;
		return add;	
	}
	public static int subtract(int x,int y) {
		int sub;
		sub= y - x;
		return sub;
	}
	public static int division(int x,int y) {
		int div;
		div= y/x;
		return div;
	}	
	    public static void main(String args[]) {
		
		int x = 10;
		int y = 20;
		System.out.println("The multiplcation of 10 and 20 :" + multiply(x, y));
		System.out.println("The addition of 10 and 20 :" + addition(x, y));
		System.out.println("The subraction of 10 and 20 :" + subtract(x, y));
		System.out.println("The division of 10 and 20 :" + division(x, y));

	}

}
