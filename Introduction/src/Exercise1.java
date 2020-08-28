import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
		// Give me the count of the link on the WebPage
		System.getProperty("webdriver.chrome.driver", "/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		int count = driver.findElements(By.tagName("a")).size();
//		System.out.println(count);
		
		// Give me the count of links present in footer of webpage
		WebElement footDriver = driver.findElement(By.id("gf-BIG"));
//		int count = footDriver.findElements(By.tagName("a")).size();
//		System.out.println(count);
		
		// Give me count of link in first column of footer
		WebElement columnDriver = footDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int count = columnDriver.findElements(By.tagName("a")).size();
		System.out.println(count);
		
		// Click on each link in the column and check if they are getting open
		// For loop opens all the links in different tabs
		for(int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++)
		{
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
			Thread.sleep(2000);
			
			}
		// Below loop prints title of all the tabs
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> it = windowIds.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
