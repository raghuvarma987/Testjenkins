package Testjenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jenkin {
	 WebDriver driver;
	@BeforeTest
	public void launchchrome() {
		System.setProperty("webdriver.chrome.driver",
				"R:\\Testing\\Java\\chromedriver 71\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https:/www.google.in");
	    driver.manage().window().maximize();
	}
	@Test
	public void ganatest(){
		driver.findElement(By.xpath("//*[@id='q']")).sendKeys("gaana");
	}
	@Test
	public void instatest(){
		driver.findElement(By.xpath("//*[@id='q']")).sendKeys("insta");
	}
	
	@AfterTest
	public void closechrome() {
		driver.close();
	}

}
