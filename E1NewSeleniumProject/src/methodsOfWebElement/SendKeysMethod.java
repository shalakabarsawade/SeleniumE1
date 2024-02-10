package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver(); // to launch chromeDriver
	driver.manage().window().maximize(); // to maximize browser
	driver.get("http://desktop-bijng2o:8080/login.do"); // to get the app
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement usnTB = driver.findElement(By.name("username"));// to find username textbox and store in a variable
	usnTB.sendKeys("admin"); // to pass inputs to username textbox
	
	}

}
