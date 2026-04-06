package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RevealInput{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		WebElement reveal=driver.findElement(By.xpath("//*[@id=\"reveal\"]"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		reveal.click();
		
		WebElement in=driver.findElement(By.id("revealed"));
		
		wait.until(ExpectedConditions.visibilityOf(reveal));
		in.sendKeys("Hii bruthaaa..");
		
	}
}
