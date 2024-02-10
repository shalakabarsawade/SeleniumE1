package actionsClassMethodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		driver.findElement(By.linkText("Drag Position")).click();
		
		
		WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		WebElement laptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		
		WebElement mobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		WebElement laptopCover = driver.findElement(By.xpath("//div[text()'Laptop Cover']"));
		
		
		WebElement mobileAccessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement laptopAccessories = driver.findElement(By.xpath("//dive[text()='Laptop Accessories']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(mobileCharger, mobileAccessories).perform();
		act.dragAndDrop(laptopCharger, laptopAccessories).perform();
		act.dragAndDrop(mobileCover, laptopAccessories).perform();
		act.dragAndDrop(laptopCover, laptopAccessories).perform();
		
		
	}
	

}
