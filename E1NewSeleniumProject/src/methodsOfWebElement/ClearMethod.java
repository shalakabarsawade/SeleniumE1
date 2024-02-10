package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("\"http://desktop-bijng2o:8080/login.do");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement usnTB = driver.findElement(By.name("username"));
	usnTB.sendKeys("admin");
	Thread.sleep(2000);
	
	usnTB.clear(); // to clear the text present in username textbox
	
	
	
	
	}

}
