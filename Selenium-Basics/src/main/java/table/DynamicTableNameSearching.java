package table;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableNameSearching {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("2k22cse161@kiot.ac.in");
		
		WebElement password=driver.findElement(with(By.tagName("input")).below(email));
		password.sendKeys("Vetri@1234");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		//String head=driver.findElement(By.xpath("//*[@id=\"myTable\"]/thead/tr")).getText();
		//System.out.println(head);
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"myTable\"]/tbody/following-sibling::tr"));
		
		System.out.println("Available names : ");
		
		for(int i=1;i<=rows.size();i++) {
			WebElement element=driver.findElement(By.xpath(("//*[@id=\"myTable\"]/tr["+i+"]")));
			
			String[] details=element.getText().split(" ");
			
			System.out.println(details[0]);
		}
		
		System.out.print("Enter name : ");
		String expectedName=sc.nextLine();
		
		for(int i=1;i<=rows.size();i++) {
			WebElement element=driver.findElement(By.xpath(("//*[@id=\"myTable\"]/tr["+i+"]")));
		
			String details=element.getText();
			
			if(details.toLowerCase().contains(expectedName.toLowerCase())) {
				System.out.print(details);
			}
			
		}
		
		driver.quit();
		
	}
}
