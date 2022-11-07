package com.selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumRevise  {

	public static void main(String[] args) throws Throwable  {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pbrad\\eclipse-workspace\\Selenium_project01\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get
		("https://www.amazon.in/s?i=shoes&bbn=1983572031&rh=n%3A1983572031%2Cp_72%3A1318476031%2Cp_85%3A10440599031%2Cp_36%3A-49900&s=popularity-rank&fs=true&pf_rd_i=27037351031&pf_rd_i=6648217031&pf_rd_i=6648217031&pf_rd_i=6648217031&pf_rd_m=A1K21FY43GMZF8&pf_rd_m=A1K21FY43GMZF8&pf_rd_m=A1K21FY43GMZF8&pf_rd_m=A1K21FY43GMZF8&pf_rd_p=b0d86f90-c25f-498a-bf03-6720e8db2542&pf_rd_p=b3532ea5-708c-4424-8c5b-b37600eb7a8c&pf_rd_p=e1dacb2a-34dc-4645-892c-2b20140e94b8&pf_rd_p=f18fff26-9cff-47cf-b5c9-aabd33cb8a1d&pf_rd_r=9Q42F25ZTBJE1EA2FA76&pf_rd_r=KM03NZQC2D1SGDBQ9A5V&pf_rd_r=T3DW1EMQP971HWVAS6ZB&pf_rd_r=XF2CHYT23QGMBCBZ4FA9&pf_rd_s=merchandised-search-5&pf_rd_s=merchandised-search-5&pf_rd_s=merchandised-search-6&pf_rd_s=mobile-hybrid-5&pf_rd_t=101&pf_rd_t=101&pf_rd_t=101&pf_rd_t=30901&qid=1647543476&rnid=4516629031&ref=sr_st_popularity-rank");
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
		Thread.sleep(10000);
		
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles);
		List<String> uniqueId= new ArrayList<String>(windowHandles);

		System.out.println(uniqueId);
		
		String string1 = uniqueId.get(0);
		String string2 = uniqueId.get(1);
		
		
		
		System.out.println(parentWindow);
		System.out.println(string1);
		System.out.println(string2);
		
		driver.switchTo().window(string1);
		Thread.sleep(2000);
		driver.switchTo().window(string2);
		Thread.sleep(2000);
		driver.switchTo().window(string1);
		Thread.sleep(2000);
		driver.switchTo().window(string2);
		Thread.sleep(2000);
		driver.switchTo().window(string1);
		Thread.sleep(2000);
		driver.switchTo().window(string2);
		
		driver.quit();
			
		
		
		
		/*driver.switchTo().window(parentWindow2);
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow3);
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow4);*/
		
		
	}

}
