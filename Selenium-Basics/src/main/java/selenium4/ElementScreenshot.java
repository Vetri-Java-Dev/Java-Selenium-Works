package selenium4;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoqa.com/browser-windows");
		
		try {
			WebElement element=driver.findElement(By.xpath("//*[@id=\"browserWindows\"]/h1"));
			
			TakesScreenshot ts=(TakesScreenshot) element;
			
			File source=element.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("C:\\Users\\Vetrivel B\\OneDrive\\Desktop\\screenshot selenium\\logo2.png"));
		}
		
		catch(Exception e) {
			//e.printStackTrace();
		}
		
		driver.close();
		
	}
}
