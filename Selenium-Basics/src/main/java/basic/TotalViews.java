package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TotalViews {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://configureselenium.blogspot.com/");
		
		String views=driver.findElement(By.xpath("//span[contains(@class,\"counter-wrapper\")]")).getText();
		
		System.out.print(views);
		
	}
}
