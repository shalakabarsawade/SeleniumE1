package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']"));
		loginButton.submit();
	}

}
