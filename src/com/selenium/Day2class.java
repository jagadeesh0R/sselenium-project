package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class Day2class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		/*driver.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);*/
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.click();
		findElement.sendKeys("child_ofprophecy7");
		//Thread.sleep(3000);
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.click();
		findElement2.sendKeys("Password1234567");
		Thread.sleep(3000);
		WebElement findElement3 = driver.findElement(By.name("login"));
		findElement3.click();
		
		Thread.sleep(5000);
		//driver.close();

	}

}
