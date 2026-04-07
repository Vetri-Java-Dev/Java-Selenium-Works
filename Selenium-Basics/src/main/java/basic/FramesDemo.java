package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"frame1\"]"));
		
		driver.switchTo().frame(frame);
		System.out.println("Switched using web element");
		
		String heading=driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
		System.out.println(heading);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		System.out.println("Switched index");
		
		heading=driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
		System.out.println(heading);
		
		driver.close();
	}
}
