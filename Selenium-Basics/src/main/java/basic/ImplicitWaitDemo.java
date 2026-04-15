package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropBtn=driver.findElement(By.className("dropbtn"));
		
		dropBtn.click();
		
		WebElement flipkart=driver.findElement(By.xpath("//a[contains(@href,\"flipkart\")]"));
		
		flipkart.click();
		
		if("https://www.flipkart.com/".equals(driver.getCurrentUrl()))
			System.out.print("Loaded");
		else
			System.out.print("Not loaded ");
		
	}
}

