package ArrayProgram;

import java.util.Scanner;

public class descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size =");
		int a=sc.nextInt();
		int []b=new int[a];
		System.out.println("enter element ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i] < b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;	
				}		
			}
		}
		System.out.println();
		System.out.print("the sorted array is = ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(" "+b[i]);
		}

	}

}
