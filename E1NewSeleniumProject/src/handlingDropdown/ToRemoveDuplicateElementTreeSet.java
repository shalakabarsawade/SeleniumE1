package handlingDropdown;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToRemoveDuplicateElementTreeSet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Tejas/Desktop/WebElements/MultiSelectDropdown.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		
		Select sel = new Select(multiSelectDD); // to select object of Select
		
		//to remove the duplicate the using and store the element in Ascending Order
		TreeSet<String> ts = new TreeSet<String>(); // to create the object of TreeSet
		
		List<WebElement> Options = sel.getOptions(); // to get the list of all options
		
		for(WebElement we : Options)
		{
			String texttoInsert = we.getText();
			ts.add(texttoInsert);
		}
		for(String text : ts)
		{
			System.out.println(text);
		}
		
	}

}
