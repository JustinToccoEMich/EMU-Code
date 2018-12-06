package finalproject1;

import java.util.Scanner;

public class Main 
{
	static Scanner sc = new Scanner(System.in);
	static String command = "";
	static String userid = "";
	static String email = "";
	static String name = "";
	static List users = new List();
	
	public static void main(String[] args) 
	{
		System.out.println("Todo List Program:\n(Type \"help\" for menu)");
		while(true)
		{
			command = sc.nextLine();
			command.toLowerCase();
			if(command.equals("exit"))
			{
				System.out.println("Thank you for using the Todo List program. Exitting now...");
				break;
			}
			else if(command.equals("help"))
			{
				System.out.println("exit ---------- exits the program");
				System.out.println("adduser ------- add a new user for this todo list");
			}
			else if(command.equals("adduser"))
			{
				addUser();
			}
			
			
			else
			{
				System.out.println("Command \"" + command + "\" is not supported");
			}
		}
	}
	
	public static void addUser()
	{
		boolean repeat = true;
		while(repeat)
		{
			System.out.print("Please enter the new user's userid (cannot contain space and cannot be empty): ");
			userid = sc.nextLine();
			if(userid.toLowerCase().equals("exit")) {return;}
			if(users.usedUserid(userid))
			{
				System.out.println("the userid \"" + userid + "\" is already used");
			}
			else if(!userid.replaceAll("\\s","").equals(userid))
			{
				System.out.println("the userid \"" + userid + "\" is invalid (cannot contain white spaces)");
			}
			else
			{
				repeat = false;
			}
		}
		repeat = true;
		while(repeat)
		{
			System.out.print("Please enter the new user's email: ");
			email = sc.nextLine();
			if(email.toLowerCase().equals("exit")) {return;}
			if(users.usedEmail(email))
			{
				System.out.println("The email \"" + email + "\" is already used");
			}
			else if(email.indexOf('@') == -1)
			{
				System.out.println("invalid email");
			}
			else
			{
				repeat = false;
			}
		}
		repeat = true;
		while(repeat)
		{
			System.out.print("Please enter the new user's name (cannot be empty): ");
			name = sc.nextLine();
			if(name.toLowerCase().equals("exit")) {return;}
			if(name.replaceAll("\\s","").equals(""))
			{
				System.out.println("invalid name (cannot be empty)");
			}
			else
			{
				repeat = false;
			}
		}
		users.addUser(new User(userid, email, name));
	}

}
