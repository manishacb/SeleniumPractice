import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTable {

	public static void main(String[] args) {
			System.getProperty("webdriver.chrome.driver", "/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29733/jt-vs-stz-3rd-match-caribbean-premier-league-2020");
			WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
			System.out.println(table.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']")).getText());
	}

}
