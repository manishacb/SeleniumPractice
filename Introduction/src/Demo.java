import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// Invoke .exe file first
		System.getProperty("webdriver.chrome.driver", "/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		// System.getProperty("webdriver.gecko.driver", "/home/xebia/Documents/Eclipse/geckodriver-v0.26.0-linux64/geckodriver.exe");
		// Created webdriver object for chrome browser and we have strictly implemented
		// methods of driver
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}

