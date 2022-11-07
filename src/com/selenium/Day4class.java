package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4class {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		//Thread.sleep(3000);
		WebElement alert1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert1.click();
		Thread.sleep(2000);
		Alert okalert = driver.switchTo().alert();
		okalert.accept();
		WebElement alerticon2 = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		alerticon2.click();
		Thread.sleep(2000);
		WebElement sendalert2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		sendalert2.click();
		Alert okaycancel = driver.switchTo().alert();
		okaycancel.accept();
		WebElement alerticon3 = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		alerticon3.click();
		Thread.sleep(2000);
		WebElement sendalert3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		Thread.sleep(2000);
		sendalert3.click();
		Alert okaycancelsend = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = okaycancelsend.getText();
		//Thread.sleep(2000);
		System.out.println(text);
		//okaycancelsend.clear();
		//Thread.sleep(2000);
		okaycancelsend.sendKeys("acceptalert");
		Thread.sleep(2000);
		System.out.println(text);
		okaycancelsend.accept();
		Thread.sleep(2000);
		TakesScreenshot tsalert =(TakesScreenshot)driver;
		File save = tsalert.getScreenshotAs(OutputType.FILE);
		File location = new File("C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\screenshots\\flip.png");
		FileUtils.copyFile(save, location);
		driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> tableelements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for(WebElement totalelement:tableelements) {
			System.out.println(totalelement.getText());
		}
		

	}

}
