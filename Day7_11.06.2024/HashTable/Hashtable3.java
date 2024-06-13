package HashTable;

import java.util.Hashtable;

public class Hashtable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hashtable= new Hashtable<>();
	    hashtable.put(100, "lucky");
	    hashtable.put(101, "lucky");
	    hashtable.put(103, "ram");
	    System.out.println(hashtable);
	    System.out.println(hashtable.getOrDefault(101, "Not Found"));  
	     System.out.println(hashtable.getOrDefault(105, "Not Found"));  

	}

}
