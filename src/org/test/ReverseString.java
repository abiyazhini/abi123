package org.test;

public class ReverseString    
{    
    public static void main(String[] args) {    
        String string = "Malayalam";   
        String rev = "";
        int count = 0;    
            
        //Counts each character except space    
//        for(int i = 0; i < string.length(); i++) {    
//            if(string.charAt(i) != ' ')    
//                count++;    
//        }    
//            
//        //Displays the total number of characters present in the given string    
//        System.out.println("Total number of characters in a string: " + count);    
//    }    
        
        for (int i = 0; i < string.length(); i++) {
        	rev = rev+string.charAt(i);
		}
        System.out.println(rev);
        if(string.equals(rev))
        {
        	System.out.println("Palindrome");
        }
        else
        {
        	System.out.println("Not Palindrome");
        }
}     
}
