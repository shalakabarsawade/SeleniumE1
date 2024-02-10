package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	
	//to find/locate username textbox and pass the inputs
	WebElement usnTB = driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']"));
	usnTB.sendKeys("qspider");
	Thread.sleep(20000);
	
	//to find/locate password textbox and pass the inputs
	WebElement passTB = driver.findElement(By.cssSelector("input[type='password']"));
	passTB.sendKeys("Password@123");
	Thread.sleep(20000);
	
	//to click on login Button
	WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
	loginButton.click();
	Thread.sleep(20000);
	
	
	
	
	
	
	
	
	
	
	

	}

}
