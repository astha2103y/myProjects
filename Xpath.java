package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("astha");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yadav");
		Thread.sleep(5000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);
		driver.close();
	
	}

}