package ArraylistQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;


public class DeceSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList< String> list= new ArrayList<>();
	    list.add("Apple");
	    list.add("banana");
	    list.add("Grapes");
	    Collections.sort(list);
	    ListIterator<String> iterator=list.listIterator(list.size());
	    {
	    	while(iterator.hasPrevious())
	    	{
	    		String prString=iterator.previous();
	    		System.out.println(prString);
	    	}
	    }
	    		
	    		}

}
