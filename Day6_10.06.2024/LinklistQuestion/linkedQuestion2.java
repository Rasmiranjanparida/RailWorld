package LinklistQuestion;

import java.util.Collections;

import java.util.LinkedList;

public class linkedQuestion2 {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		Collections.sort(al, (s1, s2) -> s1.compareTo(s2));
		System.out.println(al);


	}

}
