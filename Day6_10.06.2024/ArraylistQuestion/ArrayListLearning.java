package ArraylistQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListLearning {
	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("Apple", "12", 65000, 10);
		SmartPhone ph2 = new SmartPhone("vivo", "12", 25000, 9);
		SmartPhone ph3 = new SmartPhone("oppo", "12", 15000, 7);
		List<SmartPhone> list = new ArrayList<>();
		list.add(ph1);
		list.add(ph2);
		list.add(ph3);
		System.out.println("actual list");
		System.out.println(list);
		System.out.println("Sorting the list as compartor");
		Collections.sort(list, new RatingComparator());
		System.out.println(list);
		System.out.println("Reversing the Comparator sorting");
		Comparator<SmartPhone> cmp = Collections.reverseOrder(new RatingComparator());

		Collections.sort(list, cmp);
		System.out.println("Printing the reverse list");
		System.out.println(list);

	}

}
