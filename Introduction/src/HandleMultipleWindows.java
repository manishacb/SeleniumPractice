import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver",
				"/home/xebia/Documents/Eclipse/chromedriver_linux64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.xpath("//a[contains(@href,'ap_desktop_footer_cou?ie=UTF8&nodeId=200545940')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'ap_desktop_footer_privacy_notice?ie=UTF8&nodeId=200534380')]")).click();
		System.out.println(driver.getTitle());
		Set<String>ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId1 = it.next();
		String childId2 = it.next();
		driver.switchTo().window(childId1);
		System.out.println(driver.getTitle());
		driver.switchTo().window(childId2);
		System.out.println(driver.getTitle() );
		
	}

}
