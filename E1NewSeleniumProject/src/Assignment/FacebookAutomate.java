package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomate {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(10);
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("shalakam2016@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("Shailu@1994");
	
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(2000);
	driver.close();
	}	

}
