package TestIdLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESTidlocator {

	public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Savita\\Desktop\\selenium aotomation\\ID locator\\SeleniumBrowserJars\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("input-email")).sendKeys("Admin");
	driver.findElement(By.id("input-password")).sendKeys("Admin");
	
	
		

	}

}
