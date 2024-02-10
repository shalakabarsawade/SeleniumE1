package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-bijng2o:8080/login.do");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement usn = driver.findElement(By.name("username"));
		String usnTag = usn.getTagName();
		System.out.println(usnTag);
	}

}
