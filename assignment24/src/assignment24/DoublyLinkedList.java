package assignment24;

public interface DoublyLinkedList 
{
	int size();
	boolean isEmpty();
	String first();
	String last();
	void addFirst(String e);
	void addLast(String e);
	String removeFirst();
	String removeLast();
}
