package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage
{
	WebDriver driver;
  public loginpage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  
  }
	
	@FindBy(id = "user-name")
	@CacheLookup
	WebElement usernametxt;
	
	@FindBy(id = "password")
	WebElement passwordtxt;
	
	@FindBy(id = "login-button")
	WebElement loginbtn;
	
	public void enterUsername(String uname)
	{
		usernametxt.sendKeys(uname);
	}
	public void enterPassword(String pwd)
	{
		passwordtxt.sendKeys(pwd);
	}
	public void clickonloginbtn()
	{
		loginbtn.click();
	}

}
