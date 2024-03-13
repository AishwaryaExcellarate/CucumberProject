package pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage
{
	WebDriver driver;
	public homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='app_logo']")
	@CacheLookup
	WebElement verifytitle;
	
	@FindBy(xpath = "//div[@class='inventory_item']")
	List<WebElement> productslists;
	
    By	productnames=By.xpath("//div[@class='inventory_item_name']");
    
    By  addtoCart= By.xpath("//button[@class='btn_primary btn_inventory']");
	
    public String Verifyingtitle()
	{
	 String	title=verifytitle.getText();
	 System.out.println(title);
	return title;
	}
    
    public List<WebElement> getProductList()
   	{
   		return productslists;
   		}
       
    public WebElement getProductByName(String productName)
       {
       	WebElement prod= getProductList().stream().filter(product->
           product.findElement(productnames).getText().equals(productName)).findFirst().orElse(verifytitle);
       	return prod;

       }
       
      
    public void addProductToCart(String productName)
       {
       	WebElement prod = getProductByName(productName);
       	 prod.findElement(addtoCart).click();
       }
	
	

}
