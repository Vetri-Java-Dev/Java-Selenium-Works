package keyboardActions;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionsDemo {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement link=driver.findElement(By.xpath("//*[@id=\"LinkList1\"]/div/ul/li[1]/a"));
		
		Actions action=new Actions(driver);
		
		action.keyDown(Keys.CONTROL).moveToElement(link).click().keyUp(Keys.CONTROL)
		.build().perform();
		
		Set<String> handles=driver.getWindowHandles();
		
		System.out.println("No of handles : "+handles.size());
	
		for(String handle : handles) {
			driver.switchTo().window(handle);
			
			System.out.println("Current handle : "+driver.getWindowHandle());
			
		}
		
	}
}
