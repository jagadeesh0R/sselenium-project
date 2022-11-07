package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.support.ui.Select;

public class firstproject001 {


	

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty
			("webdriver.chrome.driver",
					"C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get
			("https://www.leafground.com/select.xhtml;jsessionid=node0pruhw362cefo1we2iz1lnla91352981.node0");
			
			WebElement findElement = driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/select"));
			boolean displayed = findElement.isDisplayed();
			boolean enabled = findElement.isEnabled();
			
			System.out.println(displayed +" "+ enabled);
			
			Select dd = new Select(findElement);
			dd.selectByIndex(0);
}
}
