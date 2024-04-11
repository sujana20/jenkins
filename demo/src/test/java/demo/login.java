package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
WebDriver driver;
	
	@BeforeClass
	public void StartBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\latestcd\\chromedriver-win64\\chromedriver.exe"); 
		driver=new ChromeDriver();
	}
		

@Test (priority=1)
	public void login1() throws InterruptedException  {		
	
			driver.get("https://ecubeapps.com");
			driver.manage().window().maximize(); 
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[8]")).click();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.id("txtuserid")).sendKeys("malla.sujana@gmail.com"); 		
			driver.findElement(By.id("txtpassword")).sendKeys("123456");			
			driver.findElement(By.id("loginbtn")).click();		
	}
}