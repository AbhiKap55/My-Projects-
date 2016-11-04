
import java.util.*; 

public class LinkedListStructure 
{

	private ListNode firstNode; 
	private ListNode lastNode;  
	private Event eventObject;  
	
	public LinkedListStructure()
	{
		firstNode = null; 
		lastNode = null; 
	}
	
	public boolean isEmpty()
	{
		return firstNode == null; 
	}

	public void insertToFront(String data)
	{
		if(isEmpty()==true)
		{
			ListNode temp = new ListNode(data);
			firstNode = temp; 
			lastNode = temp; 
			
			//firstNode = lastNode = new ListNode(data) 
		}
		else 
		{
			ListNode temp = new ListNode(data); 
			temp.setNext(firstNode); 
			firstNode = temp; 
		}
	}
	
	public void printList()
	{
		if(isEmpty())
			System.out.println("The list is Empty");
		else 
		{
			ListNode current = firstNode; 
			
			while(current!=null)
			{
				System.out.print(current.getData()+" --->");
				current = current.getNext(); 
			}
			
			System.out.println(); 
		}
			
	}
	
	public void insertToBack(Event eventObj)
	{
		if(isEmpty()==true)
		{
			ListNode temp = new ListNode(eventObj);
			firstNode = temp; 
			lastNode = temp; 
		}
		else 
		{
			ListNode temp = new ListNode(eventObj); 
			temp.setNext(null);
			lastNode.setNext(temp);
			lastNode = temp; 
			
		}
	}
	
	
	public String removeFromFront()
	{
		if(isEmpty()==true)
			return "Empty";
		else if(firstNode == lastNode)
		{
			String value = lastNode.getData(); 
			firstNode = lastNode = null; 
			return value; 
		}
		else 
		{
			String dataTemp = firstNode.getData(); 
			firstNode = firstNode.getNext(); 
			return dataTemp; 
		}
	}
	
	public String removeFromBack()
	{
		if(isEmpty()==true)
			return "Empty"; 
		else if(firstNode == lastNode)
		{
			String value = lastNode.getData(); 
			firstNode = lastNode = null; 
			return value; 
		}
		else 
		{
			ListNode current = firstNode; 
			
			while(current.getNext()!=lastNode)
				current = current.getNext();
			String dataTemp = current.getData(); 
			current.setNext(null); 
			lastNode = current; 
			
			return dataTemp; 
			
		}
	}
	
	public int search(String target)
	{ 
		ListNode current = firstNode; 
		boolean isFound = false; 
		int pos = 0; 
		
		if(isEmpty())
		{
			System.out.println("List is Empty");
			return -1; 
		}
		else 
		{
		
		while(current!=null)
		{
			if(current.getData().equals(target))
				isFound = true; 
			else 
			{
				isFound = false; 
				pos++; 
			}
			current = current.getNext();
			
		}
		
		return pos; 
		
		}
		
	}
	
	public int countNodes()
	{
		ListNode current = firstNode; 
		int counter = 0; 
		
		while(current!=null)
		{
			if(current.getData()!=null)
				counter++; 
			current = current.getNext(); 
		}
		
		return counter; 
	}
	
	
	
	}
	
	

