package com.anudip.que2;

import java.util.ArrayList;
import java.util.List;

public class InsertingElements {
	
		public void Que2() {
			List <String> list = new ArrayList<String>();
			
			list.add("Laptop");
			list.add("Data");
			list.add("Java");
			list.add("Python");
			
			System.out.println("List Without Adding Element"+list);
			
			list.add(0, "InterNet");
			
			System.out.println("List After Adding new Element at Fist Position"+list);

			

	}
}
