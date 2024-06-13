package ArraylistQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList< String> list= new ArrayList<>();
	    list.add("Apple");
	    list.add("Banana");
	    list.add("Grapes");
	    Collections.sort(list);
	    for(String list1 :list)
	    {
	    	System.out.print(list1+ " ");
	    }
	    ArrayList< Integer> list2= new ArrayList<>();
	    list2.add(1);
	    list2.add(11);
	    list2.add(3);
	    Collections.sort(list2);

	}

}
