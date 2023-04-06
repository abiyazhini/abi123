package org.interclassa;

public class FibonacciSeries {

	public static void main(String[] args) {
		int f=0,s=1;
	//	System.out.println(f);
		//System.out.println(s);

		for(int i=0;i<=10;i++)
		{
			System.out.println(f);
			int t=f+s;
			f=s;
			s=t;
		}
	}

}
