package selenium_first_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_drivers/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/tinymce");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("mce_0_ifr");

		driver.findElement(By.id("tinymce")).sendKeys("Hey!!");
		
		driver.switchTo().defaultContent();
		
	}

}
