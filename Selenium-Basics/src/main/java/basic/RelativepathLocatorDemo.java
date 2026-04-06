package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativepathLocatorDemo {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#");
        
        WebElement firstName=driver.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/input[1]"));
	
        firstName.sendKeys("Vetri",Keys.ENTER);
        
        WebElement lastName=driver.findElement(with(By.tagName("input")).below(firstName));
        
        lastName.sendKeys("B",Keys.ENTER);
        
        WebElement password=driver.findElement(By.xpath("//div/input[@type=\\\"password\\\"]\""));
        
        WebElement email=driver.findElement(with(By.tagName("input")).above(password));
        
        email.sendKeys("2k22cse161@kiot.ac.in",Keys.ENTER);
        password.sendKeys("Kiot@1234",Keys.ENTER);
        
        
        
        
	
	}
}
