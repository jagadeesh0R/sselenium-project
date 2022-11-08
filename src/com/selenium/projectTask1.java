package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class projectTask1 {

	public static void main(String[] args) throws AWTException, InterruptedException  {
		
		System.setProperty
		("webdriver.chrome.driver",
				"C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement findElement = driver.findElement(By.xpath("//a[@data-reactid='16']//following::div[@data-reactid='19']"));
		findElement.click();
		Thread.sleep(2000);
		
		//Github Trail Clone
		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		findElement2.click();
		Thread.sleep(2000);
		JavascriptExecutor execute = (JavascriptExecutor)driver;
		execute.executeScript("window.scroll(0,1800)","");
		
		WebElement findElement3 = driver.findElement
				(By.xpath("(//h4[text()='Categories To Bag']//following::div[@style='padding-right: 30px;'])[1]"));
		findElement3.click();
		Thread.sleep(2000);
		
		WebElement findElement4 = driver.findElement
				(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[3]/ul/li[1]/label"));
		findElement4.click();
		Thread.sleep(2000);
		
		WebElement findElement5 = driver.findElement
				(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[3]/ul/li[4]/label"));
		findElement5.click();
		Thread.sleep(2000);
		
		List <WebElement> Elements = driver.findElements
				(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul"));
		
		for(WebElement list:Elements) {
			Thread.sleep(2000);
			
			String text = list.getText();
			System.out.println(text);
			System.out.println();
		}
		
		List <WebElement> Elements1 =driver.findElements(By.xpath(" //span[@class='product-discountedPrice']"));
		
		for(WebElement list:Elements1) {
			Thread.sleep(2000);
			String text1 = list.getText();
			System.out.println(text1);
		}
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(findElement2));
		Actions friday = new Actions(driver);
		friday.contextClick(findElement2).build().perform();*/
		
		
		
		
		/*Robot jarvis = new Robot();
		jarvis.keyPress(KeyEvent.VK_PAGE_DOWN);
		jarvis.keyRelease(KeyEvent.VK_PAGE_DOWN);
		jarvis.keyPress(KeyEvent.VK_PAGE_DOWN);
		jarvis.keyRelease(KeyEvent.VK_PAGE_DOWN);
		jarvis.keyPress(KeyEvent.VK_PAGE_DOWN);
		jarvis.keyRelease(KeyEvent.VK_PAGE_DOWN);*/		
		
		
		
		
	}

}
