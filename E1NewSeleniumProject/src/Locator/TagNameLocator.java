package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver =new ChromeDriver();// Launch The Browser
		driver.manage().window().maximize(); // To maximize the browser window
		driver.get("file:///C:/Users/Tejas/Desktop/WebElements/Username.html");// to launch the web application
		Thread.sleep(2000);
		
		
		WebElement textBox=driver.findElement(By.tagName("input"));// find Password textField on the webpage
		textBox.sendKeys("manager");// to pass the inputs to Password Textfield
		
		//Note:- Intputs are passed to Username TextField because it is 1st elements designed with input tag.
		
	}

}
