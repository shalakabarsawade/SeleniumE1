package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args, Object ops) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	Thread.sleep(1000);
	
	 WebElement activeEle =driver.switchTo().activeElement();
	activeEle.sendKeys("bikes");
	 Thread.sleep(1000);
	 
	 List<WebElement> bikesOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']")); 
	 
	//  for(int i=0; i< bikesOptions.size(); i++)
	//  {
	//   String  ops = bikesOptions.get(i).getText();
	//   System.out.println(ops);
	 //  Thread.sleep(1000);}
		 

	 
	 for(WebElement we: bikesOptions)
	 {
		 String options = we.getText();
		 System.out.println(options);
		 Thread.sleep(1000);
		 
	 }
		
	}
	
}
	 
	
	
	


