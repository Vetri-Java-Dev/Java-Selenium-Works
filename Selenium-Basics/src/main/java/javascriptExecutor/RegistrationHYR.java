package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationHYR {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("document.getElementById('firstName').value='Vetri'");
		js.executeScript("document.getElementById('lastName').value='B'");
		js.executeScript("document.getElementById('malerb').click()");
		js.executeScript("document.getElementById('englishchbx').click()");
		js.executeScript("document.getElementById('email').value='vetri@gmail.com'");
		js.executeScript("document.getElementById('password').value='Vetri@1234'");
		js.executeScript("document.getElementById('registerbtn').click()");

		if(driver.findElement(By.xpath("//*[@id=\"msg\"]")).getText().equals("Registration is Successful")) {
			System.out.print("Registeration successfull");
		}
		else {
			System.out.print("Not successfull");
		}
		
		driver.close();
	
	}
}
