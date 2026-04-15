package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithoutSelect {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.get("https://www.leafground.com/select.xhtml");

        String[] values={"JMeter","Selenium WebDriver","AWS"};

        Actions action=new Actions(driver);
       
        for (String value : values) {
        	
        		//driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete']//button")).click();
        		//driver.findElement(By.xpath("//li[text()='"+value+"']")).click();
        		
        		//WebElement button=driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete']//button"));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='j_idt87:auto-complete']//button"))).click();
            //action.moveToElement(button).click().perform();
            
            //WebElement option=driver.findElement(By.xpath("//li[text()='"+value+"']"));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='"+value+"']"))).click();
            //action.moveToElement(option).click().perform();

            System.out.println("Selected : "+value);
            
        }

    }
}