package handlingDropdown;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAllMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Tejas/Desktop/WebElements/MultiSelectDropdown.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select( multiSelectDD);
		
		//to select all the option form the dropdown using for loop
		for (int i=0; i<=4; i++) 
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		//to deselct all the selected option from the dropdown using for loop
//		for (int j=0; j<=4; j++) 
//		{
//			sel.deselectByIndex(j);
//			Thread.sleep(1000);
//		}
		sel.deselectAll();
		
	}

}
