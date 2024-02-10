package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-bijng2o:8080/login.do");
	Thread.sleep(2000);
	
	WebElement usnTB= driver.findElement(By.name("username"));
	usnTB.sendKeys("admin");
	Thread.sleep(1000);
	
	
	

	}

}
