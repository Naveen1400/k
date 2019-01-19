package smoketest.onlineshopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class smoketests {
	@Test
	public void verifypgTitle() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Assert.assertEquals("Google", driver.getTitle());
		Thread.sleep(4000);
		driver.close();

}
}