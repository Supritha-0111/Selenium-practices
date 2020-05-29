package Academy;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.baseJava;

public class validateNavigationBar extends baseJava{
	
	@Test
	public void validateNavigation() throws IOException {
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage l=new LandingPage(driver);
		Assert.assertTrue(l.getNavi().isDisplayed());
	}

}
