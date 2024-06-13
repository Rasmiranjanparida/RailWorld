package fileHandeling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try (FileReader fr = new FileReader("D:/sts/StS_program/abc.txt")) {
	            int letter;
	            while ((letter = fr.read()) != -1) {
	                System.out.print((char) letter);
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
