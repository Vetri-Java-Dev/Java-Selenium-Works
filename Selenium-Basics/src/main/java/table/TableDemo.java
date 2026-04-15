package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> elements=driver.findElements(By.xpath("//table[@id=\"table1\"]//th"));
		
		for(WebElement e : elements) {
			System.out.print(e.getText()+" ");
		}
		
		elements=driver.findElements(By.xpath("//table[@id=\"table1\"]//td"));
	
		System.out.println("\nData in table : ");
		
		for(WebElement e : elements) {
			System.out.println(e.getText()+" ");
		}
		
	}
}
