package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

 class Prodoms {
   
	public static void main(String[] args) {

  
        // Set up ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
       
    WebDriver    driver = new ChromeDriver();
        // Maximize the window and navigate to the URL
        driver.manage().window().maximize();
        driver.get("https://oms.omuni.com/oms/allorder");
    

    
        // Find elements and perform login
        driver.findElement(By.id("username")).sendKeys("rufiya_su_1@omuni.com");
        driver.findElement(By.id("password")).sendKeys("agent123");
        driver.findElement(By.id("bb-login-submit")).click();


        // Quit the driver after test execution
        driver.quit();
    
}
}
