package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		 String Text1 = "stops";  
	     String Text2 = "potss";
		
	     if(Text1.length()!=Text2.length()) {
	    	 System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	     }
		
	     char[] text1 = Text1.toCharArray();
		 char[] text2 = Text2.toCharArray();
		     
		   Arrays.sort(text1);
		   Arrays.sort(text2);
		  
		   if(Arrays.equals(text1, text2)) {
			   System.out.println("The given strings are Anagram");
		   }
		   else {
			   System.out.println("The given strings are not an Anagram");
		   }
	     
	     
	     
	}
}
