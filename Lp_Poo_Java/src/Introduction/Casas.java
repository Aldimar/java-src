package Introduction;

public class Casas
{

	private String casaName;
	
	public void setCasaName(String name) 
	{
		
		casaName = name;
	}
	
	public String getCasaName() 
	{
	
		return casaName;
		
	}
	
	
	public void displayName() 
	{
	
		System.out.printf("O nome da casa é %s", getCasaName());
		
	}
	
}
