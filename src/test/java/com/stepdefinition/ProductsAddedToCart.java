package com.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.cartpage;
import pagefactory.homepage;
import pagefactory.loginpage;

public class ProductsAddedToCart
{
	WebDriver driver;
	loginpage lp;
	homepage hp;
	cartpage cp;
	@Given("user is on login page")
	public void user_is_on_login_page()
	{
		System.out.println("Step 1: user is opening the browser and go through the url and land on login page");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aishwaryaa\\eclipse-workspace\\CucumberFramework\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/v1/index.html");
	   
	}
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String uname, String pwd) 
	{
		System.out.println("Step 2: user enters username and password ");
		lp=new loginpage(driver); 
		lp.enterUsername(uname);
		lp.enterPassword(pwd);
	
     }
	@And("user clicks on login button")
	public void clicks_on_login_button()
	{
		System.out.println("Step 3: user clicks on login button");
		lp.clickonloginbtn();
		
	    
	}
	@Then("user should be navigating to home page")
	public void user_is_navigating_to_the_homepage() 
	{
		System.out.println("Step 4: user enters  homepage");
		
	    
	}
	@Given("user is on home page")
	public void user_is_on_home_page()
	{
		System.out.println("Step 5: user verifying title ");
		hp=new homepage(driver);
		hp.Verifyingtitle();
	    
	}

	@When("^user should get lists of (.*)$")
	public void user_should_get_lists_of_products(String productName) 
	{
		System.out.println("Step 6: user listing the products lists");
		System.out.println(hp.getProductList());
		System.out.println(hp.getProductByName(productName));
		
	   
	}

	@When("^user should add (.*) to the cart$")
	public void user_should_add_product_to_the_cart(String productName) 
	{
		System.out.println("Step 7: user adding product to cart");
		hp.addProductToCart(productName);
	    
	}
	@Then("user should click on carticon")
	public void user_should_click_cartbtn()
	{
		System.out.println("Step 8: user should on click on cart icon button");
		cp=new cartpage(driver);
		cp.ClickonCartIcon();
		
	}
	@Given("user should be in cartpage")
	public void user_should_in_cartpage()
	{
		System.out.println("Step 9: user should be on the cartpage");
		
	}
	
	@When("^user should verify (.*) in the cartpage$")
	public void user_should_verify_sauce_labs_bike_light_in_the_cartpage(String productName)
	{
		System.out.println("Step 10: user verified products in the cartpage");
		System.out.println(cp.getproductByName(productName));
	    
	}
	@And("user closed the browser")
	public void user_close_browser()
	{
		System.out.println("Step 11: user closed the browser");
		driver.close();
	}


}
