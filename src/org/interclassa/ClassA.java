package org.interclassa;

public class ClassA {
	public ClassA()
	{
		System.out.println("default constructor");
	}
	public static void aaa(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
	//ClassA a=new ClassA();
	ClassA.aaa(10, 26);
	
	}

}
