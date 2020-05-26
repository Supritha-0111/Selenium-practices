package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {

	private static final String login1 = null;
	WebDriver driver;

	public RediffLoginPagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * By username = By.id("login1"); By pwd = By.id("password"); By login =
	 * By.name("proceed");
	 */

	@FindBy(id = "login1")
	WebElement udername;

	@FindBy(id = "password")
	WebElement pwd;

	@FindBy(name = "proceed")
	WebElement login;

	public WebElement Email() {

		return udername;
	}

	public WebElement Password() {
		return pwd;
	}

	public WebElement Singin() {
		return login;
	}

}
