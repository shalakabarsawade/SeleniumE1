package actionsClassMethodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4");
		
		driver.findElement(By.xpath("//section[text()='Button']"));
		driver.findElement(By.partialLinkText("Double Click")).click();
		
		WebElement yesButton1 = driver.findElement(By.id("btn20"));
		WebElement noButton2 = driver.findElement(By.id("btn23"));
		WebElement ratingButton3 = driver.findElement(By.id("btn26"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(yesButton1).perform();
		act.doubleClick(noButton2).perform();
		act.doubleClick(ratingButton3).perform();
		
		
		

	}

}
