package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/drag.xhtml");
		
		Actions act=new Actions(driver);
		
		WebElement box1=driver.findElement(By.xpath("//*[@id=\"form:drag\"]"));
		WebElement box2=driver.findElement(By.xpath("//*[@id=\"form:drop\"]"));

		//act.clickAndHold(box1).moveToElement(box2).build().perform();
		
		act.dragAndDrop(box1, box2).perform();
		
		System.out.print(box2.getText());
	}
}
