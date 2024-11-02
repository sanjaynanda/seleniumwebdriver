import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {

	@Test(priority=1)
	void openapp()
	
	{
		Assert.assertTrue(false);
	}
	@Test(priority=2,dependsOnMethods={"openapp"})
	void login()
	
	{
		
	}
	@Test(priority=3,dependsOnMethods={"openapp"})
	void search()
	
	{
		
	}
	@Test(priority=4,dependsOnMethods={"openapp"})
	void advancesearch()
	
	{
		
	}
}
