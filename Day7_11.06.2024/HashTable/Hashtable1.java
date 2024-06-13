package HashTable;

import java.util.Hashtable;

import java.util.Map;

public class Hashtable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Hashtable<Integer, String> hashtable= new Hashtable<>();
	    hashtable.put(100, "lucky");
	    hashtable.put(101, "lucky");
	    hashtable.put(103, "ram");
	    System.out.println(hashtable);
	    for(Map.Entry<Integer, String> m:hashtable.entrySet())
	    {
	    	System.out.println(m.getKey() + " "+m.getValue());
	    }
	   

	}

}
