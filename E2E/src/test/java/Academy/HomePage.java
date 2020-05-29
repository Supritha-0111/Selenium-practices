package Academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.baseJava;

public class HomePage extends baseJava{

	@Test(dataProvider="getData")
	public void basePageNavigation(String username, String password) throws IOException{
		driver=initializeDriver();
		
		driver.get("http://qaclickacademy.com");
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		LoginPage log=new LoginPage(driver);
		log.getEmail().sendKeys(username);
		log.getPassword().sendKeys(password);
		log.getLogin().click();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[2][2];
		
		data[0][0]="nonristricted@gmail.com";
		data[0][1]="21214";
		
		data[1][0]="restricted@gmail";
		data[1][1]="8767";
		
		return data;
	}
}
