package selenium_first_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebPageElementsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Selenium_drivers/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.pizzahut.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Boolean logo = driver.findElement(By.xpath("//div[@class = 'col-xs-2 col-sm-4 col-lg-3 logo']")).isDisplayed();
		System.out.println("Pizza Hut Logo is present :"+logo);
		
		//Menu Codes
		/*driver.findElement(By.xpath("//i[@class = 'fa fa-angle-down']")).click();
		driver.findElement(By.xpath("//a[@class = 'dropdown-item ph-titlecase ph-more-font']")).click();
		driver.findElement(By.xpath("//a[@class = 'btn btn-lg btn-link ph-titlecase ng-scope']")).click();*/
		
		//Deals Codes		
		driver.findElement(By.linkText("Deals")).click();
		driver.findElement(By.linkText("Order Now")).click();
		
		//Address Codes
		/*driver.findElement(By.xpath("//span[@class = 'center-block icon-delivery-default']")).click();
		driver.findElement(By.name("deliveryStreet")).click();
		driver.findElement(By.cssSelector("input [id = 'syo-address1']")).sendKeys("9355 Yucca Way");
		driver.findElement(By.id("ph-find-store")).click();*/
		
		driver.findElement(By.xpath("//span[@id = 'find-occasion-carryout']")).click();
		driver.findElement(By.id("user-location")).click();
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'col-xs-12 ph-margin-top-15']/a/span[1]"))).click();

		
		//driver.findElement(By.xpath("//div[@class = 'col-xs-12 ph-margin-top-15']/a/span[1]")).click();
		driver.findElement(By.xpath("//[@class = 'btn ph-ordernow ng-scope btn-primary']")).click();
	}

}
