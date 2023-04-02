
public class Queue {
	int size=5;
	int queue[]=new int[size];
	int front, rear;
	public Queue()
	{
		rear=-1;
		front=0;
	}
	
	public boolean isFull()
	{
	  if(rear==size-1)
		  return true;
	  else
		  return false;
	}
	
	public boolean isEmpty()
	{
		if(front>rear)
			return true;
		else
			return false;
	}
	
	public void insert(int element)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		else
		{
			rear++;
			queue[rear]=element;
		}
	}
	
	public int remove()
	{
		int element = 0;
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			element=queue[front];
			front++;
		}
		return element;
	}
	void display()
	{
		if(isEmpty())
			System.out.println("Queue is Empty");
		else
		{
		for(int i=front;i<=rear;i++)
			System.out.println(queue[i]);
		}
	}
}
