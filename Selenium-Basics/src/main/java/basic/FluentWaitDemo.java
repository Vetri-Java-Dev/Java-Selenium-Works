package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		WebElement reveal=driver.findElement(By.xpath("//*[@id=\"reveal\"]"));
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		reveal.click();
		
		WebElement in=driver.findElement(By.id("revealed"));
		
		Wait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(2))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);

		    wait.until(
		        d -> {
		          in.sendKeys("Hii bruthaaa..");
		          return true;
		        });
		
	}
}
