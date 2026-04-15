package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsMethods {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		System.out.println("Domain : "+js.executeScript("return document.domain").toString());
		System.out.println("URL : "+js.executeScript("return document.URL").toString());
		System.out.println("Title : "+js.executeScript("return document.title").toString());
		
		js.executeScript("history.go(0)");
		System.out.println("Refereshed");
		
		js.executeScript("window.scrollBy(0, 1000)");
		System.out.println("Scrolled");
		
		//driver.close();
	}
}
