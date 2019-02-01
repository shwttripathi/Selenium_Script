package selenium_first_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheapFlights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String absolutePath = System.getProperty("user.dir") + "/src/resources/";
		System.setProperty("webdriver.chrome.driver", absolutePath + "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cheapflights.ca/");	
	
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//input[@aria-label='Flight origin input']")).sendKeys("mum");
	}

}
