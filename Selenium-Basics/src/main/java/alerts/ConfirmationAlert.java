package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement prompt=driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
		
		prompt.click();
		
		Alert alert=driver.switchTo().alert();
		
		System.out.print("Confirmation : "+alert.getText());
		
		alert.accept();
		
	}
}
