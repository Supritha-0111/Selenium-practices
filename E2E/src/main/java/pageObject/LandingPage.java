package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By singin = By.cssSelector("a[href*='sign_in']");
	By tittle = By.cssSelector("div.text-center");
	By navBar=By.xpath("//a[text()='Contact']");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;

	}

	public WebElement getLogin() {

		return driver.findElement(singin);
	}

	public WebElement geTitle() {
		return driver.findElement(tittle);
	}
	
	public WebElement getNavi() {
		return driver.findElement(navBar);
	}
}