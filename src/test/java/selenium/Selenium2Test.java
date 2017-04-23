package selenium;

import static junit.framework.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2Test {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/tcelikel/Desktop/Selenium/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testGoogleSearch() throws InterruptedException {

		driver.get("http://www.google.com/xhtml");
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.name("q"));
		//WebElement searchBox = driver.findElement(By.id("lst-ib"));
		searchBox.sendKeys("ChromeDriver");
		searchBox.submit();
		Thread.sleep(2000);
		assertEquals("ChromeDriver - Google Search", driver.getTitle());
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}
}