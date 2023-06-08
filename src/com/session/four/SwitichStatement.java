package com.session.four;
import java.util.*;

public class SwitichStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String CandidateName = sc.nextLine();
		switch(CandidateName){
			case "Kate" : System.out.println("The name is: "+ CandidateName);
			break;
			case "Sameer" : System.out.println("The name is: "+ CandidateName);
			break;
			case "Dhoni" : System.out.println("The name is: "+ CandidateName);
			break;
			case "Virat" : System.out.println("The name is: "+ CandidateName);
			break;
			
			
		}
		sc.close();
	}

}
