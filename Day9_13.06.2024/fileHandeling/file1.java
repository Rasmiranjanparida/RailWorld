package fileHandeling;

import java.io.IOException;
import java.io.InputStreamReader;

public class file1 {
	public static void main(String[] args) {
		try(InputStreamReader isr=new InputStreamReader(System.in))
		{
			System.out.print("enter letter  ");
			int letter=isr.read();
			while(isr.ready())
			{
				System.out.print((char)letter);
				letter=isr.read();
			}
			isr.close();
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
