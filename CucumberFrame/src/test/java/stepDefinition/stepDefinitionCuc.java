package stepDefinition;


import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CucumberAutomation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinitionCuc {
	public WebDriver driver;

	    @Given("^USer is on GreenKart landing page$")
	    public void user_is_on_greenkart_landing_page() throws Throwable {
	    driver=Base.getDriver();
	    	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    	
	    }

	    @When("^User searched for \"([^\"]*)\" vegetable$")
	    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
	    	driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
	    	Thread.sleep(3000);
	    	
	    }

	    @Then("^\"([^\"]*)\" results are displayed$")
	    public void something_results_are_displayed(String strArg1) throws Throwable {
	    	Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
	    }
	    
	    @Then("^verify selected \"([^\"]*)\" are displayed in checkout page.$")
	    public void verify_selected_something_are_displayed_in_checkout_page(String strArg1) throws Throwable {
	    	Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
	    }

	    @And("^Added items to cart$")
	    public void added_items_to_cart() throws Throwable {
	    	driver.findElement(By.cssSelector("a.increment")).click();
	    	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
//	    	driver.findElement(By.xpath("button.PROCEED TO CHECKOUT")).click();
	    	
	    	
	    }

	    @And("^user proceeded to checkout page for purchase$")
	    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
	    	driver.findElement(By.cssSelector("a.cart-icon")).click();
	    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	    }

	}

