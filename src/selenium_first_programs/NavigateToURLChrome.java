package selenium_first_programs;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToURLChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String absolutePath = System.getProperty("user.dir") + "/src/resources/";
		
		
		if(System.getProperty("os.name").contains("mac")) {
		
			System.setProperty("webdriver.chrome.driver", absolutePath + "chromedriver");
		
		} else {
			
			System.setProperty("webdriver.chrome.driver", absolutePath + "chromedriver.exe");
		}
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");	
	
		driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("input#lst-ib")).sendKeys("jav");
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement search = driver.findElement(By.cssSelector("ul[role='listbox']"));
	
	List<WebElement> searchList = search.findElements(By.tagName("li"));
	
	for(WebElement searchText: searchList) {
		
		if((searchText.getText()).equalsIgnoreCase("java")) {				
			searchText.click();
			break;
		}
	}
	}

}
