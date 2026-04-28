package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer  // Used to rerun failed test cases

{
	
int counter=0;
int retrylimit=2;

public boolean retry(ITestResult result)
{
	
if (counter<retrylimit)
	
{
counter++;  //reexcute
return true;
}

	return false; // to stop execution
	
}
}
