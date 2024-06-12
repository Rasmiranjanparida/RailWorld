package ArrayProgram;

import java.util.Scanner;

public class delete {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size =");
		int a = sc.nextInt();
		int[] b = new int[a];
		System.out.print("enter element ");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		System.out.print("original array = ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);
		}
		System.out.print("\n chose a number to delete =");
		int delete=sc.nextInt();
		int id=-1;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==delete)
			{
				id=i;
				break;
			}	
		}
		if(id == -1)
		{
			System.out.println("number not found in array ");
		}
		else {
			int []arr=new int[b.length-1];
			for(int i=0,j=0;i<arr.length;i++)
			{
				if(i==id)
				{
					j++;
				}
				arr[i]=b[j++];
			}
			System.out.print("array after deleting is : ");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}

}
