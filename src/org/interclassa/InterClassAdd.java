package org.interclassa;

import org.test.InterfaceA;

public class InterClassAdd implements InterfaceA {
	 public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	 
	 public void mul(int a, int b)
	 {
		 int c = a*b;
		 System.out.println(c);
	 }

	public static void main(String[] args) {
		InterClassAdd i1= new InterClassAdd();
		i1.add(10,20);
		InterClassAdd i2 = new InterClassAdd();
		i2.mul(10, 5);
		
		
	}

}
