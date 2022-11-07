package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class TestProgram {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		WebElement googleSearch = driver.findElement(By.xpath("//input[@type='text']"));
		googleSearch.click();
		Thread.sleep(3000);
		googleSearch.sendKeys("animixplay");
		driver.manage().window().maximize();
		System.out.println("error1");
		WebElement googlefind = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
		googlefind.click();
		System.out.println("error2");
		WebElement enteranimix = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		enteranimix.click();
		WebElement searchoption = driver.findElement(By.xpath("(//img[@class='resultimg'])[4]"));
		searchoption.click();
		WebElement animixplay = driver.findElement(By.xpath("//div[@id='showstreambtn']"));
		animixplay.click();
		WebElement animixsearch = driver.findElement(By.xpath("//img[@class='imgusr']"));
		animixsearch.click();
		WebElement searchbox = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']"));
		searchbox.click();
		WebElement animixfind = driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']"));
		Thread.sleep(12000);
		driver.close();
		

	}

}
