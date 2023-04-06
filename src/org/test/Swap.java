package org.test;

public class Swap {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		//Swaping two Integers using 3rd Variable
		
//		int temp = a;
//		a=b;
//		b=temp;
//		
//		System.out.println(" Using 3rd Variable");
//		System.out.println("a= "+a);
//		System.out.println("b= "+b);
//		
		System.out.println(" without Using 3rd Variable");
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}
