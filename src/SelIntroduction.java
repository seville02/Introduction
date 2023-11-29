import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking browser
		// Chrome - ChromeDriver exten-> Methods close get
		//WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		
		//Chrome
		//System.setProperty("webdriver.chrome.driver", "/Users/sevil/Documents/chromedriver");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		//Firefox
		//System.setProperty("webdriver.gecko.driver", "/Users/sevil/Documents/geckodriver");
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		//Edge
		System.setProperty("webdriver.msedge.driver", "/Users/sevil/Documents/msedgedriver");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
	//------
		driver.get("https://clined.opspl.in/staff");
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
	}

}
