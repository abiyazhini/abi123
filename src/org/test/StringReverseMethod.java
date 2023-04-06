package org.test;
  
class ReverseStringMethod {
    public static void main(String[] args)
    {
        String str = "Hello";
  
        StringBuilder strBuild = new StringBuilder();
  
        // append a string into StringBuilder 
        strBuild.append(str);
  
        // reverse StringBuilder
        strBuild.reverse();
  
        // print reversed String
        System.out.println(strBuild);
    }
}