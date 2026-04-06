package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBoxDemo {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		WebElement add=driver.findElement(By.id("adder"));
		add.click();
		
		WebElement box=driver.findElement(By.xpath("//div[@class=\"redbox\"]"));
		
		String color=box.getCssValue("background-color");
		
		if(color.equals("rgba(255, 0, 0, 1)")) {
			System.out.println("Box color : "+color);
			System.out.println("Box width : "+box.getCssValue("width"));
			System.out.println("Box height : "+box.getCssValue("height"));
			System.out.println("Margin : "+box.getCssValue("margin"));
		}
		else
			System.out.print("Not loaded.");
		
	}
}
