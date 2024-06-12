package patternProgram;

public class Ppattren {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1 || i==1 || j==5 || i==5)
				{
				System.out.print("X ");
				}
				else
				{
				System.out.print("  ");
				}
			}
			System.out.println();
		}
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				{
				System.out.print("X ");
				}
				else {
					
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
