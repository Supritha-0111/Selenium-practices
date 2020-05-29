package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.LandingPage;
import resources.baseJava;

public class validateTittle extends baseJava {
      
	@Test
	public void tittleValidation() throws IOException {
		driver=initializeDriver();
		driver.get("http://qaclickacademy.com");
		LandingPage lan=new LandingPage(driver);
		Assert.assertEquals("FEATURED COURSES", lan.geTitle().getText());
	}
} 
