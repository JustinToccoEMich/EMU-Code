package assignment13;

import java.io.*;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		int linenumber = 0;
		linenumber = countline("critter.config");
		System.out.println(linenumber);
		
		try 
		{
			linenumber = countline2("critter.config");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println((linenumber));
		
		try
		{
		readfile("critter.config");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int countline(String filename)
	{
		FileInputStream is = null;
		Scanner sc = null;
		try 
		{
			is = new FileInputStream(filename);
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		sc = new Scanner(is);
		int num = 0;
		while(sc.hasNextLine())
		{
			num++;
			sc.nextLine();
		}
		sc.close();
		return num;
	}
	
	public static int countline2(String filename) throws IOException
	{
		int num = 0;
			FileReader reader = new FileReader(filename);
			BufferedReader inputStream = new BufferedReader(reader);
			String line = inputStream.readLine();
			while (line != null)
			{
				num++;
				line = inputStream.readLine();
			}
			inputStream.close();
		return num;
	}
	
	public static void readfile(String filename) throws FileNotFoundException
	{
		FileInputStream is = new FileInputStream(filename);
		Scanner sc = new Scanner(is);
		String word = "";
		int numAnt = 0;
		int numDoodlebug = 0;
		while(sc.hasNext())
		{
			word = sc.next();
			if(word.equals("ant:"))
			{
//				System.out.println("found ant:");
				numAnt =  Integer.parseInt(sc.next());
			}
			if(word.equals("doodlebug:"))
			{
//				System.out.println("found doodlebug:");
				numDoodlebug =  Integer.parseInt(sc.next());
			}
		}
		sc.close();
		
		int total = numAnt + numDoodlebug;

		FileOutputStream outputStream = new FileOutputStream("critter.config", true);
		PrintWriter writer = new PrintWriter(outputStream);
		writer.println(total);
		writer.close();
		
		
		
		
		
	}

}
