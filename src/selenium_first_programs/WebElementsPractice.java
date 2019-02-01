package selenium_first_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_drivers/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Radio Buttons
		
		driver.findElement(By.cssSelector("input[value = 'RoundTrip']")).click();
		
		//CheckBox
		
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		
		//Drop Downs
		// Select currency
		
		Select curDropDown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		curDropDown.selectByValue("USD");
		
		//Select Passengers
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id = 'hrefIncAdt']"))).click();
		
		
	//	driver.findElement(By.xpath("//span[@id = 'hrefIncAdt']")).click();
		driver.findElement(By.cssSelector("input[value = 'Done']")).click();
		
		//Select Origin Station
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("mum");
		
		//Select Destination
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("goa");

		
		//Select departure date
		
		driver.findElement(By.xpath("//div[@class = 'picker-first2']/input[1]")).click();
		driver.findElement(By.xpath("//div[@id = 'ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[3]/a")).click();
		
		//Select return date
		
		driver.findElement(By.xpath("//div[@id = 'Div1']/input[1]")).click();
		driver.findElement(By.xpath("//div[@id = 'ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[4]/a")).click();
		
	}

}
