package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorDemo {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		
		executor.executeScript("document.querySelector('#datepicker').click()");
		
		//WebElement alert=driver.findElement(By.id("alert1"));
		
		//executor.executeScript("");
		
	}
}
