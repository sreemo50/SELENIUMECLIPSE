package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import Common.AbstractPage;

public class EntryPage extends AbstractPage {
	public EntryPage(WebDriver driver)
	{		
		super(driver);	
		
		
	}
	
	
	/*@FindBy(how=How.XPATH,using="//*[@id='navigation-box']/div[2]/div/div/div[2]/div[4]/div[2]/span[2]")
	private WebElement Gotit;
	*/
	@FindBy(how=How.CLASS_NAME,using="_1vp5")
	private WebElement uname;
	
	
	public void namecheck(String namest)
	{
		System.out.println("come to this namecheck");
		Assert.assertTrue(uname.getText().equals(namest), "Not fount");
	}
	
	/*public void clickNext()
	{
		next.click();
	}*/

}
