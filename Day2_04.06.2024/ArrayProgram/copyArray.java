package ArrayProgram;

import java.util.Scanner;

public class copyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size =");
		int a= sc.nextInt();
		int []arr1=new int[a];
		int []arr2=new int[arr1.length];
		System.out.print("enter a element =");
		for(int i=0; i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0; i<arr2.length;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.print("original array ");
		for(int i=0; i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}
		System.out.print("\n copyed array ");
		for(int i=0; i<arr2.length;i++)
		{
			System.out.print(arr2[i]);
		}
		
	}

}
