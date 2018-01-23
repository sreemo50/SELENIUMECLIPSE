package Tests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Common.AbstractTest;
import Page.HomePage;


public class HomeTests extends AbstractTest {


	public HomeTests()
	{
		
	}
	
	@Test(priority=0)
	public void Login() {
		plaza.HomeScreen().emailentry("sree2sree02@gmail.com");		
		plaza.HomeScreen().passcodeentry("123@sreekanth");
		plaza.HomeScreen().clickOnLogin();
	  }
	
	
	
	
	}

