package handlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUndersandDeselectionMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Tejas/Desktop/WebElements/MultiSelectDropdown.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select( multiSelectDD);
		
		
		sel.selectByIndex(2); //to select an option by using the Index value
		Thread.sleep(2000);
		sel.deselectByIndex(2); //to deselect an option by using the Index value
		
		sel.selectByValue("v2"); //to select an option by using the  value
		Thread.sleep(2000);
		sel.deselectByValue("v2"); //to deselect an option by using the value
		
		sel.selectByVisibleText("Chai"); //to select an option by using the visible text
		Thread.sleep(2000);
		sel.deselectByVisibleText("Chai"); // to deselect an option by using the visible text
		
		
		
		
		
		
		

	}
}
