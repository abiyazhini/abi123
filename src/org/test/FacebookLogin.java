package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\ELCOT\\eclipse-workspace\\Test\\Driver\\chromedriver.exe");
		driver.get("https://www.facebook.com/");
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("Hello");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Hello@123");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

}
