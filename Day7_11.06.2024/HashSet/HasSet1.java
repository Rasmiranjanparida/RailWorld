package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HasSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet= new HashSet<>();
		hashSet.add("one");
		hashSet.add("two");
		hashSet.add("three");
		hashSet.add("four");
		hashSet.add(null);
		hashSet.add(null);
		Iterator<String> i=hashSet.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		hashSet.remove("one");
		System.out.println(hashSet);
		hashSet.removeAll(hashSet); 
		System.out.println("remove all the element");
		
		

	}

}
