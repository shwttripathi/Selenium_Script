package selenium_first_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String absolutePath = System.getProperty("user.dir") + "/src/resources/";
			
		System.setProperty("webdriver.chrome.driver", absolutePath + "chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://synginuat.azurewebsites.net/account/login");	
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#userNameOrEmailAddress")).sendKeys("my_user_id");
		driver.findElement(By.cssSelector("#password")).sendKeys("my_password");
		
		WebElement login_button = driver.findElement(By.cssSelector("#loginbtn"));
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click();", login_button);
		
		driver.quit();
	
	}

}
