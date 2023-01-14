package ParallelTestsWithSingleton;

public class GenericSingleton
{
	
	private GenericSingleton()
	{
		System.out.println("Object Created");
	}
	
	private static GenericSingleton genericSingleton = null;
	
	public static GenericSingleton init()
	{
		if(genericSingleton == null)
			genericSingleton = new GenericSingleton();
		
		return genericSingleton;
	}
}
