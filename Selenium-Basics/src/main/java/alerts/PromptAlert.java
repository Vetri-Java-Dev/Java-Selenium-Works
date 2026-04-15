package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

////*[@id="j_idt88:j_idt106"]/span[2]
public class PromptAlert {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement prompt=driver.findElement(By.xpath("//input[@id=\"prompt\"]"));
		
		prompt.click();
		
		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("Vetrivel B");
		
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {}
		
		alert.accept();
		
	}
}
