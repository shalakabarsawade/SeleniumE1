package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://app.fireflink.com/");
	Thread.sleep(5000);
	
	//WebElement signInLink =driver.findElement(By.partialLinkText("Sign In"));
	//signInLink.click();
	//Thread.sleep(2000);
	
	WebElement email= driver.findElement(By.xpath("//input[@name='emailId']"));
	email.sendKeys("shalakam2016@gmail.com");
	Thread.sleep(2000);
	
	WebElement password= driver.findElement(By.xpath("//input[@id='mui-2']"));
	password.sendKeys("Shailu@1994");
	Thread.sleep(2000);
	
	WebElement loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
	loginButton.click();
	
	
	
	
	
	}

}
