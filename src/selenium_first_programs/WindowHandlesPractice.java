package selenium_first_programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_drivers/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Terms")).click();
		
		String parentWinHandle = driver.getWindowHandle();
		
		String childWinHandle = null;
		
		Set<String> winHandles = driver.getWindowHandles();
	
		for(String winName : winHandles) {
			
			System.out.println("Window handle is current window is :-" +winName);
			
			if(!winName.equals(parentWinHandle)) {
				driver.switchTo().window(winName);
			}
		}
		
		System.out.println("Page title of child window :"+driver.getTitle());
	}

}
