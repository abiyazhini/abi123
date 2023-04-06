package org.test;
import java.util.*;

public class StringOccurrenceWord {

	public static void main(String[] args) {
		String s1 = "greens";
		Map<Character,Integer> mp = new LinkedHashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char ca = s1.charAt(i);
			if(mp.containsKey(ca)) {
				Integer count = mp.get(ca);
				mp.put(ca, count+1);
			}
			else
			{
				mp.put(ca, 1);
			}
			
		}
		System.out.println(mp);
		
	}

}
