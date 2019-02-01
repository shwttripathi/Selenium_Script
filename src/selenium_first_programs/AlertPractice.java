package selenium_first_programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_drivers/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.manage().window().maximize();

		
		driver.findElement(By.cssSelector("input[value = 'Confirmation Alert']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Text on alert is "+alert.getText());
		
		alert.accept();
		
		//alert.dismiss();
		
		
		
	}

}
