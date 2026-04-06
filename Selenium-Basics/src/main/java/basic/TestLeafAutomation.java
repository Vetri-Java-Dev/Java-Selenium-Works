package basic;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLeafAutomation {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0imm1kzze6fmr1k7dyffn7qtgy14507532.node0");
		
		WebElement click=driver.findElement(By.xpath("//button[@id=\"j_idt87:j_idt89\"]"));
		click.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt90\"]"))));
		WebElement hereBtn=driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt90\"]"));
		
		
		
	}
}
