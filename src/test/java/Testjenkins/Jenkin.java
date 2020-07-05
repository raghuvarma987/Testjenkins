package Testjenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jenkin {
	 WebDriver driver;
	@BeforeMethod
	public void launchchrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"R:\\Testing\\Java\\chromedriver 71\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    Thread.sleep(6000);
	    driver.manage().window().maximize();
	}
	@Test
	public void ganatest(){
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("gaana");
	}
	@Test
	public void instatest(){
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("insta");
	}
	
	@AfterMethod
	public void closechrome() {
		driver.close();
	}

}
