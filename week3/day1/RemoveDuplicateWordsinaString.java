package week3.day1;

public class RemoveDuplicateWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String text = "We learn Java basics as part of java sessions in java week1";
				int count =0;
				
				String[] str = text.split(" ");
				
				for(int i=0;i<str.length;i++) {
					
				for(int j=i+1;j<str.length;j++) {
						
				if(str[i].equalsIgnoreCase(str[j])) {
				
				str[j]=str[j].replaceAll("[A-Za-z]", " ");
					
				count++;
				
				}
		}
	}
				
				if(count>0) {
				
				for(int i=0;i<str.length;i++) {
						System.out.print(str[i] + " ");
					}
				}
		
		}
	}
