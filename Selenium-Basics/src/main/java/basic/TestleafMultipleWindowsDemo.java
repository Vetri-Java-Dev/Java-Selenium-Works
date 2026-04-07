package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestleafMultipleWindowsDemo {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		WebElement open=driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]"));
		open.click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> iterator=handles.iterator();
		
		String parentHandale=iterator.next();
		String childHandle=iterator.next();
		
		System.out.println("Parent title : "+driver.getTitle());
		
		if(driver.getTitle().equals("Window")) {
			driver.switchTo().window(childHandle);
		}
		
		System.out.println("Child title : "+driver.getTitle());
		
		WebElement multipleButton=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		
		multipleButton.click();
		
		handles=driver.getWindowHandles();
		
		
		
		
		
	}
}
