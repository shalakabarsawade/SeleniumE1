package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByExplicitTypecasting {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		
		TakesScreenshot ts= (TakesScreenshot) driver; //to perform typecasting
		
		File src = ts.getScreenshotAs(OutputType.FILE); // to take the screenshot of the webpage
		
		File dest = new File("./screenshots/google.png"); // to specify location, name and extension of screenshot
		
		Files.copy(src, dest); // to save the screenshot into screenshot folder
		
	}

}
