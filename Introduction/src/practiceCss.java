import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceCss {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("1234");
		driver.findElement(By.cssSelector("td.login_form_label_field:nth-child(2) > div:nth-child(1) > a:nth-child(1)")).click();
		

	}

}
