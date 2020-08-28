import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		driver.findElement(By.xpath("//span[@class='font30 latoBlack ']")).click();
		
		// 30 November
		
		
		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText().contains("December"))
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p[1]"));
		int count = driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p[1]")).size();
		for(int i=0; i<count; i++)
		{
			String value = driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p[1]")).get(i).getText();
			if(value.equalsIgnoreCase("1"))
			{
				driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p[1]")).get(i).click();
				break;
			}
		}

	}

}
