package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		Actions act=new Actions(driver);
		
		WebElement menuElement=driver.findElement(By.id("blogsmenu"));
		act.moveToElement(menuElement).perform();
		
		WebElement option2=driver.findElement(By.xpath("//a[@href='http://www.selenium-by-arun.blogspot.com']"));
		act.moveToElement(option2).click().build().perform();
		
		
		WebElement input=driver.findElement(By.xpath("//*[@id=\"BlogSearch1_form\"]/form/table/tbody/tr/td[1]/input"));
		input.sendKeys("Hello bruthaa",Keys.ENTER);
	}
}
