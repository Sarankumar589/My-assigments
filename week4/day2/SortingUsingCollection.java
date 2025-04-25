package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		
		String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> list = new ArrayList<String>(Arrays.asList(companies));
		
		Collections.sort(list);
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i) + ",");
		}
		


	}

}
