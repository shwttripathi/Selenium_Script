package selenium_first_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_drivers/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		Actions mouseAction = new Actions(driver);

		mouseAction.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		
		mouseAction.sendKeys(Keys.ARROW_DOWN).build().perform();
		mouseAction.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		mouseAction.contextClick().build().perform();
		
		
	}
	

}
