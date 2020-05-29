package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class baseJava {
public Properties prop;
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		 prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Supritha.h\\Eclipse workplace\\E2E\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("Browser");
		System.out.println(browserName);

		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Supritha.h\\Eclipse workplace\\E2E\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		} else if (browserName.equals( "firefox")) {

			//Firefox
			 driver = new FirefoxDriver();
			
		} else if (browserName.equals( "IE")) {
			
			//IE
			 driver = new InternetExplorerDriver();

		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;

	}
}
