package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFuction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-bijng2o:8080/login.do");
		Thread.sleep(2000);
		
		//WebElement loginButton= driver.findElement(By.xpath("//a[text()='Login']"));
		//loginButton.click();
			
		WebElement login= driver.findElement(By.xpath("//a[.='Login']"));
		login.click();
		
		driver.close();
	}

}
