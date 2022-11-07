package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestProgram2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("http://demo.automationtesting.in/Alerts.html");
        
        driver.manage().window().maximize();
        
        WebElement throwalert1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        throwalert1.click();
        
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        
        WebElement snedkeyaleart = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
        snedkeyaleart.click();
        
        WebElement throwalert2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        throwalert2.click();
        
        Alert alert2 = driver.switchTo().alert();
        
        String text = alert2.getText();
        System.out.println(text);
        
        alert2.sendKeys("jaga");
        Thread.sleep(2000);
        alert2.accept();
        
        
        
        
        
	
	}

}
