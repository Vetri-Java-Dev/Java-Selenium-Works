package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableMethod {
	
	public static void javaScriptClick(WebDriver driver, WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",element);
	}
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement alert=driver.findElement(By.id("alert1"));
		
		javaScriptClick(driver,alert);
		
		
	}
}
