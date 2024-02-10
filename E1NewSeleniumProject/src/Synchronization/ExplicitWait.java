package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver(); //to launch Chrome Browser
	driver.manage().window().maximize(); // to maximize browser
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); // to declare implicit wait
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // to declare explicit wait
	
	driver.get("https://www.shoppersstack.com/"); // to launch the web app
	
	driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro]")).click();
	
	driver.findElement(By.id("Check Dilivery")).sendKeys("411033");
	
//  1st way to use implicit wait or provide explicit wait or provide explicit condition	
//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='Check']"))));
//	driver.findElement(By.xpath("//button[@id='Check']")).click();
	
//  2nd way to use implicit wait or provide explicit wait or provide explicit condition	
	WebElement checkButton = driver.findElement(By.xpath("//button[@id='Check']"));
	wait.until(ExpectedConditions.elementToBeClickable(checkButton));
	checkButton.click();
	
	
	}

}
