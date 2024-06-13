package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b1 = new book(1, 5, "let us c", "galvin", "Rasmi");
		book b2 = new book(2, 10, "let us java", "Ram", "Rasmi");
		book b3 = new book(3, 7, "let us html", "hari", "Rasmi");
		Hashtable<Integer, book> data= new Hashtable<>();
		data.put(101, b1);
		data.put(102, b2);
		data.put(103, b3);
		for(Map.Entry<Integer, book> dataEntry : data.entrySet())
		{
			int key=dataEntry.getKey();
			book b=dataEntry.getValue();
			System.out.println(key +" details :");
			System.out.println(b.id+" ,"+b.name+" ,"+b.author+" ,"+b.publisher+" ,"+b.quantity);
		}

	}

}

class book {
	int id,quantity;
	String name,author,publisher;
	public book(int id, int quantity, String name, String author, String publisher) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}
	
}
