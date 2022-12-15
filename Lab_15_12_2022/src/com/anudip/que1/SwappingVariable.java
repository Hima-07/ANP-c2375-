package com.anudip.que1;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;

public class SwappingVariable {
	
		public void Que1() {
			
			List <String> list = new ArrayList<String>(); 
			
			list.add("Apple");
			list.add("Mango");
			list.add("Orange");
			list.add("Banana");
			list.add("Coconut");
			
			System.out.println("List Before swapping"+list);
			
			Collections.swap(list, 1, 3);
			
			System.out.println("List after Swapping"+list);
			
		}

}
