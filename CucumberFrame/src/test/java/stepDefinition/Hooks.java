package stepDefinition;
import io.cucumber.java.Before;
import CucumberAutomation.Base;
import io.cucumber.java.After;

public class Hooks extends Base {

	@Before("@MobileTest")
	public void beforeValidation() {
		System.out.println("Before mobile");
	}
	
	@After("@MobileTest")
	public void afterValidation() {
		System.out.println("After mobile");
	}
	
	@After("@SeleniumTest")
	public void afterSelenium() {
		driver.close();
	}
	
}
