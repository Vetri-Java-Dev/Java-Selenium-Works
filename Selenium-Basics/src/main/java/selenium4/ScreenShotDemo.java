package selenium4;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(source,new File("C:\\Users\\Vetrivel B\\OneDrive\\Desktop\\screenshot selenium\\screenshot.png"));
		}
		catch(Exception e) {}
		
		
	}
}
