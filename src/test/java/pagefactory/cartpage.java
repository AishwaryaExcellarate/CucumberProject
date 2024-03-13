package pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage 
{
	WebDriver driver;
	public cartpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//*[name()='svg'] ")
	WebElement  carticon;
	
	@FindBy(css = ".cart_item")
	List<WebElement> cartitems;
	
	By productnames=By.xpath("//div[@class='inventory_item_name']");

	
	public void ClickonCartIcon()
	{
		carticon.click();
	}
	
	public List<WebElement> getCartitemsList()
	{
		return cartitems;
	}
	
	public WebElement getproductByName(String productName)
	{
		WebElement cartitem = getCartitemsList().stream().filter(cart->cart.findElement(productnames).getText().equals(productName)).findFirst().orElse(carticon);
		return cartitem;
	}
	

}
