package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorUseingLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<product> p=new ArrayList<>();
		p.add(new product(1, "Lucky", 5000));
		p.add(new product(2, "guddy", 3333));
		p.add(new product(3, "dipun", 4567));
		
		System.out.println("sorting of basis of name");
		Collections.sort(p,(p1,p2)->{return p1.name.compareTo(p2.name);});
		for(product p3:p)
		{
			System.out.println(p3.id + " : "+p3.name+" : "+p3.price);
		}

	}

}

class product {
	int id;
	String name;
	float price;
	public product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}
