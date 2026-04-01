package basic;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement search=driver.findElement(By.name("q"));
		
		search.sendKeys("book",Keys.ENTER);
		
		//System.out.print("Page title : "+search.getText());
		//System.out.print("Page source : "+driver.getPageSource());
		//System.out.print("Page Url : "+driver.getCurrentUrl());
		
	}
}
