package fileHandeling;

import java.io.FileWriter;
import java.io.IOException;

public class Writeinfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hi";
		try(FileWriter fw= new FileWriter("D:/sts/StS_program/abc.txt"))
		{
			fw.write(str);
			System.out.println("done");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
