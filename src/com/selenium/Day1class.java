package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1class {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinprimeexpt5-21&ascsubtag=_k_EAIaIQobChMIlMmSqeDG-AIVr5JmAh24SQkIEAAYASAAEgIMp_D_BwE_k_&gclid=EAIaIQobChMIlMmSqeDG-AIVr5JmAh24SQkIEAAYASAAEgIMp_D_BwE");
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/Redmi-Activ-Carbon-Black-Storage/dp/B09GFPVD9Y/ref=sr_1_2?brr=1&qid=1656096585&rd=1&sr=8-2");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.quit();
		
		}

}
