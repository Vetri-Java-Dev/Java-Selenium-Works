package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentFrameDemo {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/nestedframes");
		
		WebElement parentFrame=driver.findElement(By.xpath("//*[@id=\"frame1\"]"));
		driver.switchTo().frame(parentFrame);
		
		WebElement childFrame=driver.findElement(By.xpath("/html/body/iframe"));
		driver.switchTo().frame(childFrame);
		
		driver.switchTo().parentFrame();
		
		System.out.print("Driver is in parent frame");
		
	}
}
