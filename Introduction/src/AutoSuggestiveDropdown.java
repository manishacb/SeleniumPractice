import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.goindigo.in");
		WebElement fromDropdown = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromDropdown.clear();
		fromDropdown.sendKeys("MUM");
		Thread.sleep(2000);
		fromDropdown.sendKeys(Keys.ENTER);
		WebElement toDropdown = driver.findElement(By.xpath("//input[@placeholder='To']"));
		toDropdown.click();
		toDropdown.sendKeys("CHE");
		Thread.sleep(2000);
		toDropdown.sendKeys(Keys.ARROW_DOWN);
		toDropdown.sendKeys(Keys.ENTER);
	}

}
