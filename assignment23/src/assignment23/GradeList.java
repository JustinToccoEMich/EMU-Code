package assignment23;

public class GradeList implements Cloneable
{
	public class GradeListNode
	{
		private double grade;
		private GradeListNode next;
		private GradeListNode previous;
		
		public GradeListNode(double theGrade, GradeListNode theNext, GradeListNode thePrevious)
		{
			this.grade = theGrade;
			this.next = theNext;
			this.previous = thePrevious;
		}
		
		public String toString()
		{
			if(this.previous == null && this.next == null)
			{
				return "[" + this.grade + "]";
			} else if(this.previous == null) {
				return "[" + this.grade + "->";
			} else if(this.next == null) {
				return this.grade + "]";
			} else {
				return this.grade + "->";
			}
		}
	}
	
	private GradeListNode head;
	
	public GradeList()
	{
		this.head = null;
	}
	
	public void addGrade(double newGrade)
	{
		if(this.head == null)
		{
			this.head = new GradeListNode(newGrade, null, null);
		}
		else
		{
			GradeListNode reference = this.head.next;
			GradeListNode prevReference = this.head;
			while(reference != null)
			{
				reference = reference.next;
				prevReference = prevReference.next;
			}
			prevReference.next = new GradeListNode(newGrade, null, prevReference);
		}
	}
	
	public void updateGrade(int index, double newGrade)
	{
		GradeListNode reference = this.head;
		for(int i = 0; i < index; i++)
		{
			if(reference == null)
			{
				return;
			}
			reference = reference.next;
		}
		reference.grade = newGrade;
	}
	
	public String toString()
	{
		String ret = "";
		GradeListNode reference = this.head;
		while(reference != null)
		{
			ret += reference;
			reference = reference.next;
		}
		return ret;
	}
	
	public Object clone()
	{
		GradeList newGL = new GradeList();
		GradeListNode reference = this.head;
		while(reference != null)
		{
			newGL.addGrade(reference.grade);
			reference = reference.next;
		}
		return newGL;
	}

}
