package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{

	// 1. Data Members
	@FindBy(id="pin") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueButton;
	
	// 2. Constructor
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// 3. Methods
	public void SendPin()
	{
		PIN.sendKeys("982278");
	}
	
	public void clickonContinueButton()
	{
		continueButton.click();
	}
}
