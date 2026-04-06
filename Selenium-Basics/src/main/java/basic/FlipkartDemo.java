package basic;

import java.sql.Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        
        try{
        		Thread.sleep(1000);
        	}
        catch(Exception e) {}
        
        //WebElement x=driver.findElement(By.);
        //x.click(); 
        
        WebElement search=driver.findElement(By.id("q"));
        search.sendKeys("Java selenium book",Keys.ENTER);
        
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

    }
}