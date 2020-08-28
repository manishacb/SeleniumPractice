import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingJavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String text = "Manisha Chauhan";
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		Assert.assertEquals("Hello Manisha Chauhan, share this practice page and share your knowledge", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); // Use for positivity scope in alert like Ok, Yes
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		Assert.assertEquals("Hello , Are you sure you want to confirm?", driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();  // Use for negative scope in alert like Cancel, No
	}

}
