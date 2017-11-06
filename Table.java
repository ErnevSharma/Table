public class Table{
	
	private int capacity;
	private boolean isAvailable;
	private Group group;
	
	public Table(int c)
	{
		capacity = c;
		isAvailable = true;
	}
	
	public boolean getAvailability()
	{
		return isAvailable;
	}
	
	public void filledUp(Group g)
	{
		group = g;
		isAvailable = false;
	}
	
	public void emptyTable()
	{
		isAvailable = true;
		group = null;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public Group getGroup()
	{
		return group;
	}
	
	
}