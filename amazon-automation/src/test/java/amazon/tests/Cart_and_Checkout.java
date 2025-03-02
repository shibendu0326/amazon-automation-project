package amazon.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart_and_Checkout {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "/Users/Anita/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tshirt");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		

	}

}
