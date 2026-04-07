package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToDemo {
	
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
		
		String childWindow=iterator.next();
		System.out.println("Child window : "+childWindow);
		
		driver.switchTo().window(childWindow);
		
		System.out.print("Title : "+driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());
		
		
	}
}
