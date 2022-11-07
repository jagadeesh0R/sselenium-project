package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Day3class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=amazon+com&hvadid=73048880413275&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_4cc5demh34_e");
		WebElement amazonSearch = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		amazonSearch.click();
		Thread.sleep(3000);
		amazonSearch.clear();
		Thread.sleep(3000);
		amazonSearch.sendKeys("oneplus 10 pro");
		driver.manage().window().maximize();
		
		String attributevalue = amazonSearch.getAttribute("type");
		System.out.println();
		System.out.println("attribute value of search box= "+attributevalue);
		
		String inputvalue = amazonSearch.getAttribute("value");
		System.out.println();
		System.out.println("search input= "+inputvalue);
		Thread.sleep(3000);
		
		WebElement searchIcon = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchIcon.click();
		Thread.sleep(3000);
		
		WebElement TextInElement = driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[3]"));
		TextInElement.getText();
		System.out.println();
		System.out.println("text present in web element = "+TextInElement);
		
		String pageURL=driver.getCurrentUrl();
		System.out.println();
		System.out.println("url of current page= "+pageURL);
		
		String pageTitle=driver.getTitle();
		System.out.println();
		System.out.println("Title of the current page= "+pageTitle);
		
		WebElement onePlus10pro = driver.findElement(By.xpath("(//div[@class='s-product-image-container aok-relative s-image-overlay-grey s-text-center s-padding-left-small s-padding-right-small s-flex-expand-height'])[4]"));
		onePlus10pro.click();
		Thread.sleep(20000);
		
		driver.manage().window().maximize();
		
		String window1 = driver.getWindowHandle();
		System.out.println(window1);
		Set<String>Allwindow =driver.getWindowHandles();
		System.out.println(Allwindow);
		for(String x:Allwindow) {
			if(!window1.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		
		WebElement buyNow = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		buyNow.click();
		WebElement log = driver.findElement(By.xpath("//input[@type='email']"));
		log.click();
		log.sendKeys("8610268390");
		WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		Continue.click();
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.click();
		Thread.sleep(3000);
		password.clear();
		Thread.sleep(3000);
		password.sendKeys("8610268390");
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		submit.click();
		Thread.sleep(3000);
		//driver.close();
		System.out.println();
		System.out.println("result of testcase process=testcase pass");
		
	}

}
