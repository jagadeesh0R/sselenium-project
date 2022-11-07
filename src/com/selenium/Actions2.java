package com.selenium;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		
		
		
		String num[]=new String[3];
		num[0]="alerts";
		num[1]="frames";
		num[2]="actions";
		
		
		
		
		
		Scanner topicoptions = new Scanner(System.in);
		System.out.println("alerts or frames or actions");
		String selected = topicoptions.next();
		selected = selected + topicoptions.nextLine();
		System.out.println("your selected topic "+selected);
		
		if (selected.contains(num[0])) {
			
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\Driver2\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			boolean x = selected.contains(num[0]);
			System.out.println(x);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demo.automationtesting.in/");
			driver.manage().window().maximize();
		
		
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		findElement.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		WebElement findElement2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		findElement2.click();
		WebElement findElement3 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		findElement3.click();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		TakesScreenshot aleart2 = (TakesScreenshot)driver;
		File sourceFile = aleart2.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File
				("C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\screenshots\\flipAlert1.png");
		FileUtils.copyFile(sourceFile, destinationFile);
		WebElement findElement4 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		findElement4.click();
		WebElement findElement5 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		findElement5.click();
		Alert alert3 = driver.switchTo().alert();
		String text = alert3.getText();
		Scanner scan=new Scanner(System.in);
		System.out.println(text);
		String Name = scan.next();
		Name = Name+scan.nextLine();
		Thread.sleep(2000);
		alert3.sendKeys(Name);
		alert3.accept();
		System.out.println("Name = "+Name);
		TakesScreenshot aleat3 = (TakesScreenshot)driver;
		File screenshot = aleat3.getScreenshotAs(OutputType.FILE);
		File save = new File
				("C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\screenshots\\flipAlert2.png");
		}
		
		else if (selected.contains(num[1])) {
			
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demo.automationtesting.in/");
			driver.manage().window().maximize();
		//frames
			
			
			boolean x1 = selected.contains(num[1]);
			System.out.println(x1);
		Thread.sleep(2000);
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		WebElement findElement6 = driver.findElement(By.xpath("(/html/body/section/div/div/div/input)[1]"));
		findElement6.click();
		findElement6.sendKeys("java");
		TakesScreenshot frames = (TakesScreenshot)driver;
		File ss = frames.getScreenshotAs(OutputType.FILE);
		File save = new File
				("C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\screenshots\\flipframe.png");
		FileUtils.copyFile(ss, save);
		driver.switchTo().defaultContent();
		
		WebElement findElement7 = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		findElement7.click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		WebElement findElement8 = driver.findElement(By.xpath("//input[@type='text']"));
		findElement8.click();
		findElement8.sendKeys("java");
		
		
		}
		
		else if (selected.contains(num[2])) {
			
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			boolean x = selected.contains(num[2]);
			System.out.println(x);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demoqa.com/elements");
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			
			
			/*WebElement findElement9 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
			js.executeScript("arguments[0].scrollIntoView();", findElement9);
			Thread.sleep(3000);
			findElement9.click();
			Thread.sleep(4000);*/
			
			
			//js.executeScript("window.scroll(0,8000)","");
			/*Thread.sleep(2000);
			WebElement findElement10 = driver.findElement(By.id("item-4"));
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();",findElement10);
			Thread.sleep(2000);
			findElement10.click();*/
			
			Actions mouseclick = new Actions(driver);
			
			/*WebElement findElement11 = driver.findElement(By.id("rightClickBtn"));
			mouseclick.contextClick(findElement11).build().perform();
			Thread.sleep(2000);
			WebElement findElement12 = driver.findElement(By.id("doubleClickBtn"));
			mouseclick.doubleClick(findElement12).build().perform();
			Thread.sleep(2000);
		    WebElement findElement13 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		    mouseclick.click(findElement13).build().perform();*/
			
		    
		    driver.navigate().to("http://leafground.com/pages/Dropdown.html");
		    
		    Robot keyboardbuttons = new Robot();
		    
		    WebElement findElement14 = driver.findElement(By.id("dropdown1"));
		    findElement14.click();
		    keyboardbuttons.keyPress(KeyEvent.VK_DOWN);
		    keyboardbuttons.keyRelease(KeyEvent.VK_DOWN);
		    keyboardbuttons.keyPress(KeyEvent.VK_DOWN);
		    keyboardbuttons.keyRelease(KeyEvent.VK_DOWN);
		    Thread.sleep(2000);
		   
		    keyboardbuttons.keyPress(KeyEvent.VK_ENTER);
		    keyboardbuttons.keyRelease(KeyEvent.VK_ENTER);
		    
		    WebElement findElement16 = driver.findElement
		    (By.xpath("//select[@id='dropdown3']//preceding::select[contains(@name,'dropdown2')]"));
		    findElement16.click();
		    keyboardbuttons.keyPress(KeyEvent.VK_DOWN);
		    keyboardbuttons.keyRelease(KeyEvent.VK_DOWN);
		    keyboardbuttons.keyPress(KeyEvent.VK_U);
		    keyboardbuttons.keyRelease(KeyEvent.VK_U);
		    keyboardbuttons.keyPress(KeyEvent.VK_ENTER);
		    keyboardbuttons.keyRelease(KeyEvent.VK_ENTER);
		    
		    driver.navigate().to("https://www.google.co.in/");
		    WebElement findElement15 = driver
		    .findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		    findElement15.click();
		    Thread.sleep(2000);
		    findElement15.sendKeys("lamborghini");
		    mouseclick.doubleClick(findElement15).build().perform();
		    Thread.sleep(2000);
		    keyboardbuttons.keyPress(KeyEvent.VK_CONTROL);
		    keyboardbuttons.keyPress(KeyEvent.VK_C);
		    Thread.sleep(2000);
		    keyboardbuttons.keyRelease(KeyEvent.VK_CONTROL);
		    keyboardbuttons.keyRelease(KeyEvent.VK_C);
		    Thread.sleep(2000);
		    keyboardbuttons.keyPress(KeyEvent.VK_BACK_SPACE);
		    keyboardbuttons.keyRelease(KeyEvent.VK_BACK_SPACE);
		    Thread.sleep(2000);
		    keyboardbuttons.keyPress(KeyEvent.VK_SHIFT);
		    findElement15.sendKeys("AVENTADOR");
		    keyboardbuttons.keyRelease(KeyEvent.VK_SHIFT);
		    Thread.sleep(2000);
		    keyboardbuttons.keyPress(KeyEvent.VK_SPACE);
		    keyboardbuttons.keyRelease(KeyEvent.VK_SPACE);
		    Thread.sleep(2000);
		    keyboardbuttons.keyPress(KeyEvent.VK_CONTROL);
		    keyboardbuttons.keyPress(KeyEvent.VK_V);
		    Thread.sleep(2000);
		    keyboardbuttons.keyRelease(KeyEvent.VK_CONTROL);
		    keyboardbuttons.keyRelease(KeyEvent.VK_V);
		    Thread.sleep(2000);
		    keyboardbuttons.keyPress(KeyEvent.VK_CAPS_LOCK);
		    Thread.sleep(2000);   
		    keyboardbuttons.keyRelease(KeyEvent.VK_CAPS_LOCK);
		    keyboardbuttons.keyPress(KeyEvent.VK_CAPS_LOCK);
		    Thread.sleep(2000);   
		    keyboardbuttons.keyRelease(KeyEvent.VK_CAPS_LOCK);
		    
		    
		    
		    
			System.out.println("actions compleated");
			
		}
		
		
	}

}
