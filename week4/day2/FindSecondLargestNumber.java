package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		
		int[] arrayList = {3, 2, 11, 4, 6, 7};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arrayList.length;i++) {
			list.add(arrayList[i]);
	}
		
		Collections.sort(list);
		
		int length = list.size();
		
		System.out.println("The Second largest is "+  list.get(length-2));
		

			}

	}


