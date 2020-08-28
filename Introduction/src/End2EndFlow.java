import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2EndFlow {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver",
				"/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.cssSelector("[id*='rbtnl_Trip_1']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		int count = driver.findElements(By.cssSelector("[type='checkbox']")).size();
		Assert.assertEquals(count, 6);

		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("DEL");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("PUN");

//		Thread.sleep(2000);
//		driver.findElement(By.id("travelOptions")).click();

//		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.cssSelector("[class*='highlight']")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		driver.findElement(By.cssSelector("[class*='highlight']")).click();
//
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000);
//		int i=1;
//		while(i<4)
//		{
//		driver.findElement(By.id("hrefIncAdt")).click();
//		i++;
//		}
//		int j=1;
//		while(j<3)
//		{
//		driver.findElement(By.id("hrefIncChd")).click();
//		j++;
//		}
//		driver.findElement(By.id("hrefIncInf")).click();

//		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//		adult.selectByValue("4");
//		
//		Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
//		child.selectByValue("3");
//		
//		Select infant = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
//		infant.selectByValue("1");
//		
//		Select s = new Select(driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']")));
//		s.selectByValue("USD");
//		
//		driver.findElement(By.cssSelector("input[id*='FindFlights']")).click();
	}

}
