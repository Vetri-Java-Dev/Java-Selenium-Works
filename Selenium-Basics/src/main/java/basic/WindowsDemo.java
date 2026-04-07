package basic;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsDemo {
	private static final String Set = null;

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		WebElement windowButton=driver.findElement(By.xpath("//button[@id=\"tabButton\"]"));
		
		System.out.println("Parent window : "+(driver.getWindowHandle()));
		
		Set<String> allWindow=driver.getWindowHandles();
		System.out.println("Count : "+allWindow.size());
		
		windowButton.click();
		
		Set<String> newWindows=driver.getWindowHandles();
		System.out.println("New Count : "+newWindows.size());
		
		String parentHandle=driver.getWindowHandle();
		
		System.out.println("Parent window : "+parentHandle);
		
		Iterator<String> iterator=newWindows.iterator();
		
		iterator.next();
		
		System.out.println("Child window : "+iterator.next());
		
		
	}
}
