package basic;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {};
		
		driver.navigate().to("https://www.amazon.in/");
		
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {};
		
		driver.navigate().forward();
		
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {};
		
		driver.navigate().back();
		
		driver.navigate().refresh();
	}
}
