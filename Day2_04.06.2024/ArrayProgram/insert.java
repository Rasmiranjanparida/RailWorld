package ArrayProgram;

import java.util.Scanner;

public class insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size =");
		int a = sc.nextInt();
		int[] b = new int[a];
		System.out.println("enter element ");
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		System.out.print("original array = ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);
		}

		System.out.print("\n insert a number = ");
		int c = sc.nextInt();
		System.out.print("enter which index you want ");
		int d = sc.nextInt();
		if (d < 0 || d > a) {
			System.out.println("enter valid input ");
		} else {
			int[] arr = new int[b.length + 1];
			System.out.print("here the extended array = ");
			for (int i = 0, j = 0; i < arr.length; i++) {
				if (i == d) {
					arr[i] = c;
				} else {
					arr[i] = b[j++];
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(" " + arr[i]);
			}
		}

	}

}
