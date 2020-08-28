import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffCSS {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.rediff.com/");
//		driver.findElement(By.cssSelector("a[class='signin']")).click();
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("manisha@gmail.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("manisha");
		driver.findElement(By.cssSelector("input[class*='signin']")).click();
		
	}

}
