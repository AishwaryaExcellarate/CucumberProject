package com.stepdefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Loginsteps
{
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page()
	{
		System.out.println("Step1: User is on Login page");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aishwaryaa\\eclipse-workspace\\CucumberFramework\\drivers\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
		System.out.println("Step1: User enters credentials");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
	    
	}

	@And("click on login button")
	public void click_on_login_button()
	{
		System.out.println("Step2: User clicking on login button");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}
	@Then("user should land on homepage")
	public void user_should_land_on_homepage() 
	{
		System.out.println("User is on home page");
	    
	}

	@Then("close the browser")
	public void close_the_browser() 
	{
		System.out.println("closing the browser");
	   driver.close();
	}

	

	
}
