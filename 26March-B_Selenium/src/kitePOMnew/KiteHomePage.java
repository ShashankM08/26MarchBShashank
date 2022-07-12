package kitePOMnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{

	// 1.Data Members
	@FindBy(xpath="//span[@class='user-id']") private WebElement userName;
	@FindBy(xpath="//a[@target='_self']") private WebElement logoutButton;
	
	
	// 2. Constructor
    public KiteHomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    // 3. Methods
    public void validateUserName(String expectedUserID)
    {
    	String expectedUserName=expectedUserID;
    	String actualUserName = userName.getText();
    	
    	
    	if(actualUserName.equals(expectedUserName))
    	{
    		System.out.println("Test Case passed");
    	}
    	
    	else
    	{
    		System.out.println("TC failed");
    	}	
    	
    }
    
    
    
    
    public String getActualUserName()   // New thing added for TestNG class,  A
   // Actual username return type is String so change the return type from   *'void to String'*
    {
    	String actualUserName = userName.getText();
    	return actualUserName;
    }
    
    
    public void logOut() throws InterruptedException
	{
		userName.click();
		Thread.sleep(200);
		
		logoutButton.click();
	}
}

