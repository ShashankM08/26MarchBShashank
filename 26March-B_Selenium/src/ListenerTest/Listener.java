package ListenerTest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) // Result is obj of ITestResult Interface
	{
		Reporter.log("Screenshot Taken, Please check TC", true);
		// To get name of that test case
		Reporter.log("Failed TC name is "+result.getName(), true);  // To get the name of particular TC
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test case passed", true);
		Reporter.log("Successful TC name is "+result.getName(), true);  // To get the name of particular TC
	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC is skipped, Please check Dependancy", true);
		Reporter.log("Skipped TC name is "+result.getName(), true);
	}
	
}
