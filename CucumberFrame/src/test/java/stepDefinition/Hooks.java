package stepDefinition;
import io.cucumber.java.Before;

import io.cucumber.java.After;

public class Hooks {

	@Before("@MobileTest")
	public void beforeValidation() {
		System.out.println("Before mobile");
	}
	
	@After("@MobileTest")
	public void afterValidation() {
		System.out.println("After mobile");
	}
}
