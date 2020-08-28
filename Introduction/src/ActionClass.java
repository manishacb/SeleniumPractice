import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver",
				"/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement move  = driver.findElement(By.xpath("(//span[@class='nav-line-2 '])[1]"));
		// write in capital letters
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		// move to specfic element
		a.moveToElement(driver.findElement(By.xpath("(//span[@class='nav-line-2 '])[1]"))).contextClick().build().perform();
	}

}
