package basic;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class FlipkartDemo {

    @Test
    public void flipkartTest() {
    	
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=new");

        WebDriver driver = new EdgeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        WebElement x = driver.findElement(By.className("b3wTlE"));
        x.click();

        String title = driver.getTitle();
        System.out.println("Title : " + title + " Length : " + title.length());

        String url = driver.getCurrentUrl();
        System.out.println("Current URL : " + url);

        String source = driver.getPageSource();
        System.out.println("Source code length : " + source.length());

        driver.quit();
    }
}