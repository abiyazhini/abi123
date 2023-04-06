package org.test;

public class PalindromeNumeric {

	public static void main(String[] args) {
		int num=12321;
		int rev=0;
		int temp=num;
		int count=0;
//		while(num>0)
//		{
//			int n=num%10;
//			rev=(rev*10)+n;
//			num/=10;
//		}
//		if(rev==temp)
//		{
//		System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("Not Palindrome");
//		}
		//count the digits
		while(num>0)
		{
			count++;
			num/=10;
		}
		System.out.println(count);
	}

}
