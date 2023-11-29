import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "/Users/sevil/Documents/chromedriver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://spicejet.com");
	//	 Thread.sleep(15000L);
		driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).click();    
				//class("divpaxinfo")).click();

		   Thread.sleep(2000L);
		   
		   Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		 //Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		 driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		 System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		 Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		 
		// ----
		 
		 System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		 System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		 {

		 System.out.println("its enabled");

		 Assert.assertTrue(true);

		 }

		 else

		 {

		 Assert.assertTrue(false);

		 }
		 
		 
		 
		   
		   /*int i=1;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}*/

		 //  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for(int i=1;i<5;i++)

		{

			driver.findElement(By.className("css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid")).click();
					//id("hrefIncAdt")).click();

		}

		driver.findElement(By.className("css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
}
}
