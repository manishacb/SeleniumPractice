import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<9)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); // 8 times
			i++;
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
	
	}

}
