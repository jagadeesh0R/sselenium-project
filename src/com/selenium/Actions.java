package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.AllArguments;

public class Actions {



	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		findElement.click();
		findElement.clear();
		findElement.sendKeys("lamborghini");
		Thread.sleep(3000);
		
		WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='eIPGRd'])[1]"));
		findElement2.click();
		WebElement findElement3 = driver.findElement(By.xpath("(//span[@class='bmaJhd iJddsb'])[2]"));
		findElement3.click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,80000)","");
		js.executeScript("window.scroll(0,80000)","");
	    Thread.sleep(4000);
	    
	    WebElement sdown = driver.findElement(By.xpath("(//a[@class='wXeWr islib nfEiy'])[68]"));
		js.executeScript("arguments[0].scrollIntoView();",sdown);
		
		WebElement findElement5 = driver.findElement(By.xpath("(//a[@class='wXeWr islib nfEiy'])[68]"));
		findElement5.click();
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\screenshots\\flip.png");
		FileUtils.copyFile(source, destination);
		
		driver.navigate().to("https://www.album.alexflueras.ro/");
		Thread.sleep(3000);
		
		WebElement sright = driver.findElement(By.xpath("(//img[@border='0'])[16]"));
		js.executeScript("window.scroll(5000,0)","");
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",sright);
		
		TakesScreenshot sn = (TakesScreenshot) driver;
		File sourcen = sn.getScreenshotAs(OutputType.FILE);
		File destinationn = new File("C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\screenshots\\flip1.png");
		FileUtils.copyFile(sourcen, destinationn);
		
		driver.navigate().to("http://leafground.com/home.html");
		Thread.sleep(3000);
		WebElement findElement4 = driver.findElement(By.xpath("(//li[@class='col-lg-3 col-md-3 col-sm-3'])[5]"));
		findElement4.click();
		Thread.sleep(2000);
		
		WebElement findElement6 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(findElement6);
		select.selectByIndex(3);
		
		WebElement findElement7 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select select1 = new Select(findElement7);
		select1.selectByVisibleText("UFT/QTP");
		
		WebElement findElement8 = driver.findElement(By.id("dropdown3"));
		Select select2 = new Select(findElement8);
		select2.selectByValue("3");
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		Select select3 = new Select(findElement8);
		
		List<WebElement> dropOptions = select3.getOptions();
		Integer size = dropOptions.size();
		System.out.println("total number of options in dropdown = "+size);
		
		WebElement findElement9 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select select4 = new Select(findElement9);
		select4.selectByIndex(2);
		Thread.sleep(2000);
		findElement9.sendKeys("UFT/QTP");
		
		WebElement findElement10 = driver.findElement(By.xpath("(//div[@class='example'])[5]"));
		boolean enabled = findElement10.isEnabled();
		System.out.println(enabled);
		boolean selected = findElement10.isSelected();
		System.out.println(selected);
		
		WebElement findElement11 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		Select select5 = new Select(findElement11);
		findElement11.sendKeys("UFT/QTP");
		
		WebElement findElement12 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select select6 = new Select(findElement12);
		boolean multiple = select6.isMultiple();
		System.out.println(multiple);
		select6.selectByIndex(1);
		select6.selectByIndex(2);
		select6.selectByIndex(3);
		select6.selectByIndex(4);
		Thread.sleep(3000);
		select6.deselectAll();
		Thread.sleep(1000);
		select6.selectByIndex(2);
		Thread.sleep(1000);
		select6.selectByIndex(3);
		Thread.sleep(1000);
		select6.selectByIndex(4);
		Thread.sleep(1000);
		select6.deselectByValue("2");
		select6.deselectByVisibleText("Loadrunner");
		
		List<WebElement> dropOptions5 = select6.getOptions();
		System.out.println("options selected in dropdown "+dropOptions5);
		Integer size1 = dropOptions5.size();
		System.out.println("total number of options in dropdown = "+size1);
		
		
		
		
		TakesScreenshot ss1 = (TakesScreenshot)driver;
		File source2 = ss1.getScreenshotAs(OutputType.FILE);
		File destination2 = new File
		("C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\screenshots\\flip2.png");
		FileUtils.copyFile(source2, destination2);
		System.out.println("Screenshot");
		

	}

}
