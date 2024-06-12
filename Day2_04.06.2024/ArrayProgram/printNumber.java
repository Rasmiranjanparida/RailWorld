package ArrayProgram;

import java.util.Scanner;

public class printNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=10;
		int []b=new int[a];
		System.out.println("enter array elemeent");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i< b.length;i++)
		{
			System.out.print(b[i] + " ");
		}
	}

}
