package selenium4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://omayo.blogspot.com/");
		
	}
}
