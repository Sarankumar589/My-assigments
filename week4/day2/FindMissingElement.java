package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
	
		
		int[] array = {1, 2, 3, 4, 10, 6, 8};

		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++) {
			list.add(array[i]);
		}
		
		
		//List {1, 2, 3, 4, 10, 6, 8}
		
		
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i) != i+1) {
				System.out.println(i+1 );
			}
			
		}
		
	}
	
	
}

	


