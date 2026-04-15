package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDataFirstRow {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> elements=elements=driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
		
		System.out.println("Column : "+elements.size());
		
		elements=elements=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		System.out.println("row : "+elements.size());
		
		driver.close();
	}
}
