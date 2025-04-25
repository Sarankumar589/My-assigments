package week3.day1;

public class ReverseOddWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester"; 
		// Split the string into words
        String[] sent = test.split(" "); 

        // reverse the odd-positioned words
        for (int i = 1; i < sent.length; i += 2) {
            sent[i] = new StringBuilder(sent[i]).reverse().toString(); 
        }

        String result = String.join(" ", sent);
        System.out.println(result);
		
	}

}
