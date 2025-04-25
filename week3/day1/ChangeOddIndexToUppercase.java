package week3.day1;

import java.util.Arrays;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringText = "changeme";
		
		char[] characterArray = stringText.toCharArray();
		
		for(int i=0;i<characterArray.length;i++) {
			
			if(i%2!=0) {
				//char a = charArray[i];
				
				characterArray[i] = Character.toUpperCase(characterArray[i]);
			
			
			}
			
		}
		System.out.println("Output is "+Arrays.toString(characterArray));
		
		
		
		
	}

}
