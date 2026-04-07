package basic;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductStoreLogin {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://www.demoblaze.com/");
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement login=driver.findElement(By.xpath("//*[@id=\"login2\"]"));
		login.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"loginusername\"]")));
		
		WebElement userName=driver.findElement(By.xpath("//input[@id=\"loginusername\"]"));
		userName.sendKeys("vetri1735");
		
		WebElement password=driver.findElement(with(By.tagName("input")).below(userName));
		password.sendKeys("Vetri@1234",Keys.ENTER);
		
		
		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"logout2\"]")));
		WebElement logout=driver.findElement(By.xpath("//*[@id=\"logout2\"]"));
		
		if(logout.getText().equals("Log out" )) {
			System.out.print("Logged in");
		}
		else {
			System.out.print("Not logged in");
		}
		
	}
}
