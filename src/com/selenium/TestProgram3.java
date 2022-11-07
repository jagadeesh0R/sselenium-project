package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestProgram3 {



	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get
		("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement findElement = 
				driver.findElement
				(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		findElement.sendKeys("mobiles");
		Thread.sleep(3000);
		
		List<WebElement> findElements = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]"));
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			System.out.println(text);
			
			if (text=="mobiles under 8000") {
				webElement.click();
			}
			
		}
		
	}

}
