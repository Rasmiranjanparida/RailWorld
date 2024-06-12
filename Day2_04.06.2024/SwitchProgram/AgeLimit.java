package SwitchProgram;

import java.util.Scanner;

public class AgeLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age ");
		Scanner sc= new Scanner(System.in);
		int age=sc.nextInt();
		int y=age>=18? 1:0;
	    switch (y) {
		case  1: {
			
			System.out.println("Yes you can vote");
			break;
		}
        case  0: {
			
			System.out.println("No you can not vote");
			break;
		}
		
		default:
			System.out.println("no you can not vote ");
		}
	    sc.close();

	}

}
