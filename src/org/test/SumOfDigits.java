package org.test;

public class SumOfDigits {

	public static void main(String[] args) {
		int num = 12321;
		int sum=0;
		
		while(num>0)
		{
			int n = num%10;
			sum=sum+n;
			num/=10;
		}
		System.out.println("sum of given digit is: "+sum);
	}

}
