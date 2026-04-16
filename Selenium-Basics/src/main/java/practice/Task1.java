package practice;

import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vetrivel%20B/Downloads/selenium-practice-site.html");
		
		if(driver.getTitle().equalsIgnoreCase("selenium practice hub")) {
			System.out.println("Browser launched");
		}
		
		//registration
		driver.findElement(By.id("first-name")).sendKeys("Vetri");
		driver.findElement(By.id("last-name")).sendKeys("Vel");
		driver.findElement(By.id("email")).sendKeys("vetri@gmaiil.com");
		driver.findElement(By.id("password")).sendKeys("1234567890");
		driver.findElement(By.id("confirm-password")).sendKeys("1234567890");
		driver.findElement(By.id("phone")).sendKeys("7896541230");
		
		WebElement dropdown = driver.findElement(By.id("country"));
		Select select = new Select(dropdown);
		
		List<WebElement> options=select.getOptions();
		
		for(WebElement element : options) {
			if(element.getText().equalsIgnoreCase("india")) {
				select.selectByContainsVisibleText("India");
				break;
			}
		}
		
		//accepting terms and conditions
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submit-btn")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement success=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("success-message"))));
		
		if(success.getText().toLowerCase().contains("successful")) {
			System.out.println("Registration succesful");
		}
		else {
			System.out.println("Registration failed");
		}
		
		driver.quit();
	}
}
