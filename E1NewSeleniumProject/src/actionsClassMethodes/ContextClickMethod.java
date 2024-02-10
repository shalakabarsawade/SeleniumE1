package actionsClassMethodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4");
		
		Actions act = new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
		WebElement rigthClickLink = driver.findElement(By.partialLinkText("Right Click"));
		
		WebElement button1 = driver.findElement(By.xpath("//button[@id='btn]"));
		act.click(button).perform();
		driver.fo
		
		
	}

}
