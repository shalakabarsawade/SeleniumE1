package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		String pageSource= driver.getPageSource();
		System.out.println(pageSource);
	

	}

}
