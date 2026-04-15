package table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingDatas {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> elements=driver.findElements(By.xpath("//table[@id=\"table1\"]//th"));
		
		System.out.println(driver.findElement(By.xpath(("//*[@id=\"table1\"]/thead/tr"))).getText());
	
		int col=driver.findElements(By.xpath(("//*[@id=\"table1\"]/thead/tr"))).size();
		
		System.out.println("\nData in table : ");
		
		for(int i=1;i<=col;i++) {
			WebElement element=driver.findElement(By.xpath(("//*[@id=\"table1\"]/tbody/tr["+i+"]")));
			System.out.println(element.getText());
		}
		
		driver.close();
	}
}
