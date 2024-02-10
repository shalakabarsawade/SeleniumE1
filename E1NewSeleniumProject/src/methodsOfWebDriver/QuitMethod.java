package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();// to lauch web application
		Thread.sleep(1000);
		driver.manage().window().maximize();// to maximaize the browser window.
		
		driver.get("https://omayo.blogspot.com/");// to lauch the web application
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Open a popup window")).click();// to open a new(child) Browser window
		Thread.sleep(1000);
		
		//driver.close(); ...to close the parent window
		
		
		driver.quit();// to close the parent as well as child Browser window.
		
	}

}
