import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCSSSelector {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.findElement(By.cssSelector("a[rel='nofollow']")).click();
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("manisha@gmail.com");
		// Identifying with attribute ID then only #IDValue is required
		driver.findElement(By.cssSelector("#password")).sendKeys("manisha");
		// Identifying with attribute CLASS then only .ClassValue is required, 
		// if there is space in between value of class then replace it dot
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
		

	}

}
