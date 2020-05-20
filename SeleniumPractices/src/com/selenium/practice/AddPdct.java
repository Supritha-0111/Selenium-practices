package com.selenium.practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddPdct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Supritha.h\\Eclipse workplace\\SeleniumPractices\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver, 5);

		String[] items = { "Cucumber", "Brocolli", "Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().window().maximize();

		itemsAdded(driver, items);
		
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
				
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}

	public static void itemsAdded(WebDriver driver, String[] items) {
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String trimedName = name[0].trim();
			List L = Arrays.asList(items);
			if (L.contains(trimedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j == 3) {
					break;
				}
			}
		}
	}
}
