package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffLoginPagePF;

public class LginApplication {
      @Test
      public void Login() {
    	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supritha.h\\git\\Selenium-practices\\PageObject\\drivers\\chromedriver.exe");
    	  WebDriver driver=new ChromeDriver();
    	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    	  RediffLoginPagePF obj=new RediffLoginPagePF(driver);
    	 obj.Email().sendKeys("Hello");
         obj.Password().sendKeys("123a");
         obj.Singin().click();
         
      }
      
}
