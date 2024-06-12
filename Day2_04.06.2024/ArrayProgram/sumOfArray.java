package ArrayProgram;

import java.util.Scanner;

public class sumOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter  size = ");
		int a= sc.nextInt();
		int b[]= new int[a];
		System.out.print("enter element = ");
		for(int i=0;i<b.length ; i++)
		{
			b[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<b.length ; i++)
		{
			c=c+b[i];
		}
		System.out.println("the sum of array is "+c);
	}

}
