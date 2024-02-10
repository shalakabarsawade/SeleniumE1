package handlingDropdown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Tejas/Desktop/WebElements/MultiSelectDropdown.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select( multiSelectDD);
		
		for (int i=1; i<=3; i++) {
			sel.selectByIndex(i);
			}
		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		
		for (WebElement we:allSelectedOptions) 
		{
			String selectedOptions = we.getText();
			System.out.println();	
		}
		

	}

}
