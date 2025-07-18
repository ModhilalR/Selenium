package learnJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {
	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//user name
		WebElement element = driver.findElement(By.id("user-name"));
		element.sendKeys("standard_user");
		
		//password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//login
		driver.findElement(By.id("login-button")).click();
		
	}

}
