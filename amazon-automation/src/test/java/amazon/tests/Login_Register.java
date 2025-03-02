package amazon.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login_Register {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "/Users/Anita/Documents/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("Shibendubhadra0326@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("$hibendu8@");
		driver.findElement(By.id("signInSubmit")).click();
		driver.close();
		
		
		
		
		
		
		
		

	}

}
