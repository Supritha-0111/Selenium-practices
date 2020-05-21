package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffLoginPage;

public class LginApplication {
      @Test
      public void Login() {
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supritha.h\\Eclipse workplace\\PageObject\\drivers\\chromedriver.exe");
    	  WebDriver driver=new ChromeDriver();
    	  RediffLoginPage obj=new RediffLoginPage(driver);
    	 obj.Email().sendKeys("Hello");
         obj.Password().sendKeys("123a");
         obj.Singin().click();
      }
      
}
