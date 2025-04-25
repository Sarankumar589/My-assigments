package week1.day2;

public class PalindromeChecker {

	public static void main(String[] args) {
		int userinput= 121;
		
		int input = userinput;
		int output = 0;
				
		for (int i = userinput; i > 0; i /= 10) {
			output = output*10 + i % 10;
					}
	  	
		if (input == output)
			System.out.println ("Palindrome");
		
		else
			System.out.println ("Not Palindrome");
	} 
	}

