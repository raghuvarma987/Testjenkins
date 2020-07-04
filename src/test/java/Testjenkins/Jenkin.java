package Testjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jenkin {
	
	@BeforeTest
	public void jen() {
		System.out.println("Genkins");
	}
	@Test
	public void launchchrome() {
	System.setProperty("webdriver.chrome.driver",
			"R:\\Testing\\Java\\chromedriver 71\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https:/www.google.in");
    driver.manage().window().maximize();
    driver.close();
	}
	@AfterTest
	public void tess() {
		System.out.println("Genkins2");
	}

}
