package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	
WebDriver driver;
	
	private By txt_username = By.name("user-name");
	private By txt_password = By.name("password");
	private By Btn_login = By.name("login-button");
	private By sauceLabsBackpackAddToCart = By.id("add-to-cart-sauce-labs-backpack");
	private By sauceLabsBikeLightImage = By.id("item_0_img_link");
	private By sauceLabsBikeLightAddToCart = By.id("add-to-cart-sauce-labs-bike-light");
   
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		}
	

	public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin() {
		
		driver.findElement(Btn_login).click();
	}
	public void loginValidUser(String username, String password) {
		
		driver.findElement(txt_username);
		driver.findElement(txt_password);
		driver.findElement(Btn_login).click();
	}

	public void clickAddtoCart() {
		
		driver.findElement(sauceLabsBackpackAddToCart).click();
		driver.findElement(sauceLabsBikeLightImage).click();
		driver.findElement(sauceLabsBikeLightAddToCart).click();
		
	}

		
	
	
}