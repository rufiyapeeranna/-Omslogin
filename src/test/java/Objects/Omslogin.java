package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Omslogin {
    private FirefoxDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/home/RUFIYA.PEERANNA/Drivers/geckodriver-v0.33.0-linux64/geckodriver");
        driver = new FirefoxDriver();
        login(); // Calling login method once before running other tests
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(priority = 1)
    public void navigateToAllOrders() throws InterruptedException {
        Thread.sleep(3000); // Adding a sleep for stability, consider using explicit waits
        driver.findElement(By.xpath("//a[contains(text(), 'All Orders')]")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void viewOrderDetails() throws InterruptedException {
        Thread.sleep(3000); // Adding a sleep for stability, consider using explicit waits
        driver.findElement(By.xpath("(//button[@class='btn btn-default'])[1]")).click();
        driver.findElement(By.xpath("//input[@data-id='sourceOrderId']")).sendKeys("230411-007-84415016443", Keys.ENTER);
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void performOrderActions() throws InterruptedException {
        Thread.sleep(3000); // Adding a sleep for stability, consider using explicit waits
        driver.findElement(By.xpath("//a[text()='C24e461601']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@normalize-space()='Item Count']"));

        // Assuming the condition for item count is met (count >= 5)
        WebElement itemCountElement = driver.findElement(By.xpath("(//span[text()='8905951984329'])[1]"));
        String itemCount = itemCountElement.getText();
        System.out.println("Item Count: " + itemCount);
        driver.findElement(By.id("scantext")).sendKeys(itemCount, Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        driver.findElement(By.xpath("//button[text()='Ok']")).click();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//select[@name='packageSelect']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        Select s = new Select(element);
        s.selectByIndex(1);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Print Invoice')]")).click();
    }

    private void login() {
        driver.get("https://oms-preprod.ailiens.com/oms/allorder");
        driver.findElement(By.id("username")).sendKeys("rufiya887@gmail.com");
        driver.findElement(By.id("password")).sendKeys("agent123");
        driver.findElement(By.id("bb-login-submit")).click();
        try {
            Thread.sleep(5000); // Adding a sleep for stability, consider using explicit waits
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
