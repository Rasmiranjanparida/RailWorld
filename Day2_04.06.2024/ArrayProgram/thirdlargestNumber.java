package ArrayProgram;

import java.util.Scanner;

public class thirdlargestNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("enter element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0 + i; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int thirdlargest = 2;
		for (int i = 0; i < arr.length; i++) {
			if (thirdlargest == i) {
				System.out.println(" 3rd largest number "+ arr[i]);
			}
		}

	}

}
