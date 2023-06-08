package com.session.five;

public class MultiplicationOverloadedMain {

	public static void main(String[] args) {
		MultiplicationOverloaded mullobj = new MultiplicationOverloaded();
		int a = 20, b = 10, c = 15, d = 12;
		
		System.out.println(mullobj.mul(a,b));
		System.out.println(mullobj.mul(a,b,c));
        System.out.println(mullobj.mul(a,b,c,d));

	}

}
