import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "/Users/sevil/Documents/chromedriver");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
driver.get("https://www.path2usa.com/travel-companions");
//April 23
//driver.findElement(By.id("form-field-travel_comp_date")).click();
Thread.sleep(3000);
//driver.findElement(By.xpath(".//*[@id='form-field-travel_comp_date']")).click();
driver.findElement(By.id("form-field-travel_comp_date")).click();

while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
{
driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
}


List<WebElement> dates= driver.findElements(By.className("day"));
//Grab common attribute//Put into list and iterate
int count=driver.findElements(By.className("day")).size();

for(int i=0;i<count;i++)
{
String text=driver.findElements(By.className("day")).get(i).getText();
if(text.equalsIgnoreCase("21"))
{
driver.findElements(By.className("day")).get(i).click();
break;
}

}
}

}