package assignment24;

public class CourseList implements DoublyLinkedList
{
	public class Node
	{
		private String val;
		private Node next;
		private Node prev;
		
		public Node(String theVal, Node theNext, Node thePrev)
		{
			this.val = theVal;
			this.next = theNext;
			this.prev = thePrev;
		}
		
		public String getVal() {return this.val;}
		public Node getNext() {return this.next;}
		public Node getPrev() {return this.prev;}
		
		public void setNext(Node n) {this.next = n;}
		public void setPrev(Node p) {this.prev = p;}

	}
	
	private Node header;
	private Node trailer;
	private int size;
	
	public CourseList()
	{
		this.header = new Node(null, null, null);
		this.trailer = new Node(null, null, this.header);
		this.header.setNext(this.trailer);
		this.size = 0;
	}

	public int size() 
	{
		return this.size;
	}

	public boolean isEmpty() 
	{
		return this.size == 0;
	}

	public String first() {
		return this.header.next.val;
	}

	public String last() 
	{
		return this.trailer.prev.val;
	}

	public void addFirst(String e) 
	{
		Node newNode = new Node(e, this.header, this.header.next);
		this.header.next.setPrev(newNode);
		this.header.setNext(newNode);
		this.size++;
	}

	public void addLast(String e) 
	{
		Node newNode = new Node(e, this.trailer.prev, this.trailer);
		this.trailer.prev.setNext(newNode);
		this.trailer.setPrev(newNode);
		this.size++;
	}

	public String removeFirst() 
	{
		if(size == 0)
		{
			return null;
		}
		String s = this.header.next.val;
		
		Node secondNode = this.header.getNext().getNext();
		secondNode.setPrev(this.header);
		
		// this.header.next.getNext().setPrev(this.header);
		this.header.setNext(this.header.next.getNext());
		
		this.size--;
		return s;
	}

	public String removeLast() 
	{
		if(size == 0)
		{
			return null;
		}
		String s = this.trailer.prev.val;
		this.trailer.prev.getPrev().setNext(this.trailer);
		this.trailer.setPrev(this.trailer.prev.getPrev());
		this.size--;
		return s;
	}
	
	public String toString()
	{
		String s = "";
		Node temp = this.header;
		while(temp.next != null)
		{
			System.out.println(this.header.next);
			System.out.println(temp.val);
			s += temp.val + " (prev: " + temp.prev + ", next: " + temp.next + "), ";
			temp = temp.next;
			break;
		}
		return s;
	}
}