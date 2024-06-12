package ArrayProgram;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("enter element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt()-1;
		}
		System.out.println("enter number what you want ");
		int number = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (number == i) {
				System.out.println( arr[i]);
			}
		}
	}

	
}
