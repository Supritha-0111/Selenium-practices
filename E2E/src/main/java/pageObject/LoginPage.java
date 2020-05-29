package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	By email=By.id("user_email");
	By pwd=By.id("user_password");
	By logi=By.name("commit");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(pwd);
	}
	
	public WebElement getLogin() {
		return driver.findElement(logi);
	}
}

