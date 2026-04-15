package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDemo {
	public static void main(String[] args) {
			
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01w6rwi5mm8sfy13sukdu7k4j5f14556600.node0");
		
		WebElement dropDown=driver.findElement(By.xpath("//*[@id=\"j_idt87:country\"]"));
		
		Select select=new Select(dropDown);
		
		List<WebElement> options=select.getOptions();
		
		System.out.println("Available options : ");
		
		for(WebElement e : options) {
			System.out.println(e.getText());
		}
		
		select.selectByContainsVisibleText("Tool");
		select.selectByContainsVisibleText("wright");
		
		select.deselectByVisibleText("Playwright");
		
		options=select.getAllSelectedOptions();
		
		System.out.println("\nSelected options : ");
		for(WebElement e : options) {
			System.out.println(e.getText());
		}
		
		
	}
}
