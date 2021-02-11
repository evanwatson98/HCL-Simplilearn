package practice.hcl.Collect;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort {

	
	public static void main(String[] args) {
		Person person1 = new Person("Rick", 50);
		
		ArrayList<Person> p1 = new ArrayList<Person>();
		
		p1.add(new Person("Bill", 50));
		p1.add(new Person("Anna", 20));
		p1.add(new Person("Pitt", 60));
		p1.add(new Person("Jan", 30));
		p1.add(new Person("Kim", 30));
		p1.add(new Person("Bill", 30));
		p1.add(new Person("Kevin", 34));
		
		Collections.sort(p1);
		System.out.println(p1);
		
		Collections.sort(p1, new PersonByAgeComparator());
		
		System.out.println("P1 ordered: " + p1);

		
		Collections.reverse(p1);
		
		System.out.println("P1 reversed: " + p1);
		
		//Collections.binarySearch
	}

}
