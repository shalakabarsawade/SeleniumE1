package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrelloDragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://trello.com/b/pnf0mMFf/e1");
		
		driver.findElement(By.linkText("Already have an account? Log in")).click();
		driver.findElement(By.id("username")).sendKeys("shalakam2016@gmail.com");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		driver.findElement(By.xpath("//input[@id='password']"));
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		
		
		
		
		
		
		

	}

}
