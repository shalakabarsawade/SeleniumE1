package handlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandSelectionMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("file:///C:/Users/Tejas/Desktop/WebElements/SingleSelectDropdown.html");
	
	WebElement singleSelectDD = driver.findElement(By.id("menu"));
	
	Select sel = new Select(singleSelectDD);
	
	//to select an option by using Index Value
	sel.selectByIndex(2);
	Thread.sleep(2000);
	
	//to select an option by using the Value of option
	sel.selectByValue("v5");
	Thread.sleep(2000);
	
	//to select an option by using the Visible text
	sel.selectByVisibleText("Misal Paav");
	Thread.sleep(5000);
	
	

	}

}
