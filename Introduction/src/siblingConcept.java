import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class siblingConcept {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("//*[@class='desktop-navContent']/following-sibling::div[1]")).click();
		driver.findElement(By.xpath("//*[@class='desktop-navContent']/following-sibling::div[2]")).click();
		driver.findElement(By.xpath("//*[text()='Home & Living']")).click();
		driver.findElement(By.xpath("//*[text()='Essentials']")).click();
		


	}

}
