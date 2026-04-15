package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

////input[@id="prompt"]
public class SimpleAlert {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"alert1\"]"));
		
		a.click();
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		
		
	}
}
