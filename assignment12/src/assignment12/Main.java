package assignment12;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  throws IOException
	{
		FileInputStream in = null;
		FileOutputStream out = null;

		Scanner inputScanner = null;
		PrintWriter writer = null;
		
		String[] readMe = new String[10];
		
		try
		{
			in = new FileInputStream("readme.txt");
			out = new FileOutputStream("writeme.txt");
			inputScanner = new Scanner(in);
			writer = new PrintWriter(out);
			
			int lineNumber = 0;
			while(inputScanner.hasNextLine())
			{
				readMe[lineNumber] = lineNumber + " " + inputScanner.nextLine();
				lineNumber++;
			}
			for(int i = 0; i < readMe.length; i++)
			{
				System.out.println(readMe[i]);
			}
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			if(inputScanner != null)
			{
				inputScanner.close();
			}
			if(writer != null)
			{
				writer.close();
			}
		}

	}

}