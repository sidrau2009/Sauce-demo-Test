package stepdefinations;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;


public class loginsteps_POM {

	WebDriver driver = null;
	LoginPage login;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step -user is on login page");
		
		String projectPath = System.getProperty("user.dir");
		System.getProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chrome-win32");
		
		driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	   
		
		driver.navigate().to("https://www.saucedemo.com/");  
	}
	

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username , String password)throws InterruptedException {
	    
		login = new LoginPage(driver);
		
		
		login.enterUsername(username);
		login.enterPassword(password);
		
		Thread.sleep(2000);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		
		login.clickLogin();
		
		Thread.sleep(4000);
	}

	@Then("I should be logged in to the SauceDemo inventory page")
	public void i_should_be_logged_in_to_the_sauce_demo_inventory_page() throws InterruptedException {
		login.clickAddtoCart();
		
		driver.close();
		driver.quit();
		
		Thread.sleep(6000);
	}

	
}