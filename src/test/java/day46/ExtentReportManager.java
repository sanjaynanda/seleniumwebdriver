package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context)
	{
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Report");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("hostname", "locathost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Pavan");
		extent.setSystemInfo("Operating System", "Windows");
		extent.setSystemInfo("browser", "chrome");
		
		
	}
	
	
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "TEST  CASE PASSED IS:"+result.getName());
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "TEST  CASE FAILED IS:"+result.getName());
		test.log(Status.FAIL, "test case fail cause is:"+result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "TEST  CASE SKIPPED IS:"+result.getName());
	}

	public void onFinish(ITestContext context)
	{
		extent.flush();
	}

}
