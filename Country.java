
public class Country 
{
	
	String[] names = {"Pranav", "Abhi", "Markus", "Lotaro", "Jimmy", "Kyohei", "Vineet"};
	List[] countries = new List[7]; 
	int temp; 
	
	public Country()
	{
		 for(int i = 0; i<names.length;i++)
			 countries[i] = new List();   
	}
	
	public void addCountry(String targetName, String country)
	{
		boolean isFound = false; 
		
		for(int i = 0; i<names.length;i++)
		{
			if(names[i].equals(targetName)) 
			{
				temp = i; 
				countries[temp].insertToBack(country);
				isFound = true; 
			}

		}
		
		if(isFound == true)
			System.out.println("Added");
		else 
			System.out.println("Not Found");
		
	}
	
	public void printCountries(String targetName)
	{
		for(int i = 0; i<names.length;i++)
			if(names[i].equals(targetName))
				temp = i; 
		countries[temp].printList();
	}
	
	public void printAll() 
	{
		for(int i = 0; i<names.length;i++)
		{
			System.out.println(names[i]);
			temp = i; 
			countries[temp].printList();
		}
	}
}
