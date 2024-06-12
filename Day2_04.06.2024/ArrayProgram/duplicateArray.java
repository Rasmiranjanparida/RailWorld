package ArrayProgram;

import java.util.Scanner;

public class duplicateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size = ");
		int a=sc.nextInt();
		int []b=new int[a];
		System.out.println("enter element ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("thair duplicate value = ");
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
				{
					System.out.print(b[j]+ " ");
				}
			}
				
		}
	}

}
