package StringSplit;

public class ExtractToTalTestCases
{

	public static void main(String[] args)
	{
		String inputString = "TestCasesPassed100TestCassesFailed50TestCasesSkipped25";
		
		String testCasesPassed = (inputString.split("TestCasesPassed")[1]).split("TestCassesFailed")[0];
		String testCasesFailed = (inputString.split("TestCassesFailed")[1]).split("TestCasesSkipped")[0];
		String testCasesSkipped = inputString.split("TestCasesSkipped")[1];
		
		int totalTestCases = Integer.parseInt(testCasesPassed) + Integer.parseInt(testCasesFailed) + Integer.parseInt(testCasesSkipped);
		
		System.out.println(totalTestCases);
		
	}
}
