package HashTable;

import java.util.Hashtable;

public class Hashtable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hashtable= new Hashtable<>();
	    hashtable.put(100, "lucky");
	    hashtable.put(101, "lucky");
	    hashtable.put(103, "ram");
	    System.out.println(hashtable);
	    hashtable.remove(100);
	    System.out.println(hashtable);

	}

}
