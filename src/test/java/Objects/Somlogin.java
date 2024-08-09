package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import groovyjarjarantlr4.v4.runtime.tree.xpath.XPath;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Somlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.chrome.driver", "/home/RUFIYA.PEERANNA/driver/chromedriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://som.omuni.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bb_m-kamlanr_store@omuni.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("agent123");
		driver.findElement(By.xpath("//button[@id='bb-login-submit']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(), 'show all products')]")).click();

	//	driver.findElement(By.xpath("//i[@class='icomoon-search3'])[2]")).click();
driver.findElement(By.xpath("//body[1]/div[2]/div[1]/header[1]/div[3]/div[1]/div[3]/div[1]/button[1]/i[1]")).click();
	driver.findElement(By.xpath("//input[@id='global-search-input']")).sendKeys("8905125994017",Keys.ENTER);
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	  Thread.sleep(3000);

	  js.executeScript("window.scrollBy(0,200)");
	  Thread.sleep(3000);
	 /*  int size = driver.findElements(By.tagName("iframe")).size();
	  System.out.println(size);*/
	  //driver.switchTo().frame(0);
  WebElement   element=      driver.findElement(By.xpath("//iframe[@href='blackberrys-men-hcpm0018w1za22fa-white-mens-handkerchief-REYTM4GBJVJ']"));
       driver.switchTo().frame(element);
	
	driver.findElement(By.xpath("//a[@href='blackberrys-men-hcpm0018w1za22fa-white-mens-handkerchief-REYTM4GBJVJ']")).click();
	
	
	}
	
	
	
	
	
	
	}
