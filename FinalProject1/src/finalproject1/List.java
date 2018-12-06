package finalproject1;

public class List 
{
	public class Node
	{
		private User user;
		private Node next;
		
		public Node(User theUser, Node theNext)
		{
			this.user = theUser;
			this.next = theNext;
		}
	}
	
	private Node head;
	
	public List()
	{
		head = new Node(null, null);
	}
	
	public void addUser(User u)
	{
		Node newUser = new Node(u, head.next);
		head.next = newUser;
	}
	
	public boolean usedUserid(String id)
	{
		Node temp = this.head;
		while(temp.user != null)
		{
			if(temp.user.getUserid().equals(id))
			{
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public boolean usedEmail(String em)
	{
		Node temp = this.head;
		while(temp.user != null)
		{
			if(temp.user.getEmail().equals(em))
			{
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
}
