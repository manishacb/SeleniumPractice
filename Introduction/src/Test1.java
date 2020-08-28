import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		System.getProperty("webdriver.chrome.driver", "/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("manishachauhan6490@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ma06ma13ad01");
		driver.findElement(By.linkText("Forgotten account?")).click();
//		driver.close();
	}

}
