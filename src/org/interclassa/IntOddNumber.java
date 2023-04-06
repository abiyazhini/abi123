package org.interclassa;

public class IntOddNumber {

	public static void main(String[] args) {
		int count=0, evenTotal=1, oddTotal=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				
				evenTotal=evenTotal+i;
				count++;
				System.out.println(i);
			}
		}	
		System.out.println("Occurence of Evens:"+count);
		System.out.println("Total Evens:"+evenTotal);
		
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				oddTotal=oddTotal+i;
				//count++;
			}
		}
		System.out.println("Occurence of Odds:"+count);
		System.out.println("Total Odds:"+oddTotal);
	}

}
