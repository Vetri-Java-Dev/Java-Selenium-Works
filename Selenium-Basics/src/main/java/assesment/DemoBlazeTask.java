package assesment;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

public class DemoBlazeTask {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://demoblaze.com/");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("login2"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")))
                .sendKeys("vetri1734");
 
        driver.findElement(By.id("loginpassword")).sendKeys("1234");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout2")));
        System.out.println("Login Successful");

        Actions actions=new Actions(driver);
        WebElement laptops=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Laptops']")));
        actions.moveToElement(laptops).click().perform();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[text()='Samsung galaxy s6']")));

        List<WebElement> elements=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='tbodyid']//h4/a")));

        List<String> laptopList=new ArrayList<>();
        for (WebElement element : elements) {
            laptopList.add(element.getText());
        }

        Collections.sort(laptopList);

        Set<String> laptopSet=new LinkedHashSet<>(laptopList);

        System.out.println("Sorted Laptop List:");
        for (String lap : laptopSet) {
            System.out.println(lap);
        }

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement macbook=driver.findElement(By.xpath("//a[text()='MacBook Pro']"));

        js.executeScript("arguments[0].scrollIntoView(true);", macbook);

        String productTitle=macbook.getText();
        System.out.println("Found Laptop : " + productTitle);

        macbook.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add to cart']"))).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        System.out.println("Product added to cart");
        System.out.println("MacBook Pro added to cart.");
        System.out.println("Alert handled successfully.");

        driver.findElement(By.id("cartur")).click();

        WebElement name=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[2]")));

        WebElement price=driver.findElement(By.xpath("//td[3]"));

        System.out.println("Product Name: " + name.getText());
        System.out.println("Product Price: " + price.getText());
        System.out.println("Product Name and Cost verified successfully");

        driver.findElement(By.xpath("//button[text()='Place Order']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Vetri");
        
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Chennai");
        driver.findElement(By.id("card")).sendKeys("123456");
        driver.findElement(By.id("month")).sendKeys("April");
        driver.findElement(By.id("year")).sendKeys("2026");

        driver.findElement(By.xpath("//button[text()='Purchase']")).click();

        WebElement confirm=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[10]/h2")));

        String purchase=confirm.getText();

        if (purchase.contains("Thank you")) {
            System.out.println("Order is placed successfully");
            System.out.println(purchase);
        }
        else {
            System.out.println("Order is Unsuccessful");
        }

        driver.findElement(By.xpath("//button[text()='OK']")).click();

        driver.quit();
    }
}