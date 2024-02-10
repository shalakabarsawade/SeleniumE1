package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805511%7Cb%7Cfacebook%20create%20account%7C&placement=&creative=550525805511&keyword=facebook%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-12091220328%26loc_physical_ms%3D9301536%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMInM3ota-WhAMVSm99Ch2rOA4lEAAYASAAEgIMkfD_BwE");
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(dayDropdown);
		boolean result1 = daySelect.isMultiple();
		System.out.println("daydropdown is multiple? :"+result1);
		
		List<WebElement> dayOptions = daySelect.getOptions();
		
		for(WebElement we :dayOptions) {
			System.out.println(we.getText());
		}
		daySelect.selectByIndex(16);
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		Select monthSelect = new Select(monthDropdown);
		boolean result2 = monthSelect.isMultiple();
		System.out.println("month Dropdown is multiple? :"+result2);
		
		List<WebElement> monthOptions = monthSelect.getOptions();
		for(WebElement we: monthOptions) {
			System.out.println(we.getText());
		}
		System.out.println("---------------------------------------------------------");
		System.out.println();
		
		Select yearSelect = new Select(yearDropdown);
		boolean result3 = yearSelect.isMultiple();
		System.out.println("yeardropdown is multiple? :"+result3);
		
		List<WebElement> yearOptions = yearSelect.getOptions();
		for(WebElement we : yearOptions) {
			System.out.println(we.getText());
		}

	}

}
