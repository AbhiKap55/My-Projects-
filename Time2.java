
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

import javax.swing.JOptionPane; 

public class Time2   
{

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in); 
		LocalDateTime array[] = new LocalDateTime[3]; 
		
		System.out.println("Event 1 in how many hours from now?");
		array[0] = LocalDateTime.now().plusHours(sc.nextInt()); 
		
		System.out.println("Event 2 in how many hours from now?");
		array[1] = LocalDateTime.now().plusHours(sc.nextInt()); 
		
		System.out.println("Event 3 in how many hours from now?");
		array[2] = LocalDateTime.now().plusHours(sc.nextInt()); 
				
		long[] timeDif = new long[array.length]; 
		
		for(int i = 0;i<array.length;i++)
		{

			long td = ChronoUnit.HOURS.between(LocalDateTime.now(), array[i]);  
			timeDif[i] = ++td; 
			
			if(timeDif[i] < 0)
			{
				timeDif[i] = -99; 
				array[i] = null; 
				System.out.println("ignored event #"+(i+1)+" as time has elapsed");
			}
	
		}
		
		//System.out.println("-----------------TIME DIF ARRAY ------------");
		findMin(timeDif);  
		
		System.out.println("----------- Time to All Events ----------");
		printArray(timeDif); 
		
	}
	
	public static void printArray(long[] array)
	{
		for(int i = 0;i<array.length;i++)
			System.out.println(array[i]);
	}
	
	public static void findMin(long[] array)
	{
		long m = array[0];
		int index = 0; 
		
		for(int i = 0;i<array.length;i++)
			System.out.println(""+array[i]);
		
		for(int i = 0;i<array.length;i++)
		{
			if(array[i] <= m && array[i] >0)
			{
				m = array[i];
				index = i; 
			}
			else 
				index = 0; 
		}
		

		System.out.println("Closest event is event #"+(index+1)+" in "+m+" Hours ("+(m*60)+") minutes");
	}
	
	public static void eventsWithin3Days(long[] array)
	{
		for(int i = 0;i<array.length;i++)
		{
			if(array[i] <= 4320 && array[i] >=0)
				JOptionPane.showMessageDialog(null, "Event # "+i+" is less than 3 days away! "); 
		}
	}
}
 