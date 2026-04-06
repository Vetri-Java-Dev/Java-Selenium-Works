package basic;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInlogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/");
		
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/a"));
		
		signin.click();
		
		WebElement emailField=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement passwordField=driver.findElement(with(By.tagName("input")).below(emailField));
		
		emailField.sendKeys("2k22cse161@kiot.ac.in");
		passwordField.sendKeys("vetrivelsonu1234",Keys.ENTER);
		
		//driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[4]/button")).click();
		
		String expectedURL="https://www.linkedin.com/feed/";
		String actualOutput=driver.getCurrentUrl();
		
		if(expectedURL.equals(actualOutput)) {
			System.out.print("Successfully logged in");
		}
		else {
			System.out.print("Log in failed");
		}
		
	}
}
