package Objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascripting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();

		driver.get("https://oms.omuni.com/oms/allorder");
		//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	//	jsExecutor.executeScript("document.getElementById('username')");





	}

}
