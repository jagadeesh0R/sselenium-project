package com.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_project {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty
		("webdriver.chrome.driver", "C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\Driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		findElement.click();
		Thread.sleep(2000);
		findElement.sendKeys("rolex watches");
		Thread.sleep(2000);
		
		List<WebElement> Elements = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
		
		
		for(WebElement list:Elements) {
			Thread.sleep(2000);
			String text = list.getText();
			
			if(text.equalsIgnoreCase("rolex watch")) {
				list.click();
			}
			else {
				System.out.println("no match for input");
			}
			
			boolean Case = text.equalsIgnoreCase("rolex watches");
			System.out.println("equalsIgnoreCase = "+Case);
			
			System.out.println(text);
			
			 
					}
		
	/*	for(int i=0; i<Element.size(); i++) {
			if(Element.get(i).getText().equalsIgnoreCase("rolex watches")) {
				WebElement indexElement = Element.get(i);
				String selectedText = indexElement.getText();
				indexElement.click();
				System.out.println(selectedText);
				break;
				}
			System.out.println("task complete");*/
			
			
		
		
			
			
		
		

	}

}
