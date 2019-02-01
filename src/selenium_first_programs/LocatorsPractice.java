package selenium_first_programs;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_drivers/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//Learn ID locator
		
		Boolean logo = driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println("Logo is present: "+logo);
		
		//Learn Name Locator
	
		driver.findElement(By.name("q")).sendKeys("a");
		driver.findElement(By.name("q")).sendKeys(Keys.BACK_SPACE);
		
		//Learn class locator
		
		Boolean microPhone = driver.findElement(By.className("gsri_a")).isDisplayed();
		System.out.println("Micro Phone is displayed :" +microPhone);
		
		//Learn Link Text
		
		//Example 1
		Boolean gmail = driver.findElement(By.linkText("Gmail")).isEnabled();
		System.out.println("gmail is enabled on webpage :"+gmail);
		
		//Example 2
		Boolean signIn = driver.findElement(By.linkText("Sign in")).isEnabled();
		System.out.println("Sign in is enabled on webpage: "+signIn);
		
		//Learn Partial Text
		
		Boolean images = driver.findElement(By.partialLinkText("Imag")).isDisplayed();
		System.out.println("Images is displayed on webpage: "+images);
		
		
		//Learn xpath
		// xpath expression = "//tagname[@attribute='value']"
		
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		Boolean maps = driver.findElement(By.xpath("//a[@id='gb8']/span[1]")).isEnabled();
		System.out.println("maps is present inside google apps: "+maps);
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		
		
		//Learn css
		// css expression = "tagname[attribute='value']"
		
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("java");
		driver.findElement(By.cssSelector("input[value='Google Search']")).click();
				
		
		//Learn tagName
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of links present on the webpage:- "+allLinks.size());
		
		for(WebElement li:allLinks) {
			System.out.println(li.getAttribute("href"));
		}
		
	}

}
