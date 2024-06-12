
//2) Java Program to find the frequency of each element in the array
package ArrayProgram;

public class frequency_2 {

	public static void main(String[] args) {
	
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		
		int[] fr = new int[arr.length];
		int flag = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					
					fr[j] = flag;
				}
			}
			if (fr[i] != flag)
				fr[i] = count;
		}

		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != flag )
				System.out.println(arr[i] + "   ::  " +fr[i]);
		}
	
	}
}//if i want print frequency part in 27 line if (fr[i] != flag && fr[i]==2) and if you want to number part (fr[i] != flag && arr[i]==2) 
