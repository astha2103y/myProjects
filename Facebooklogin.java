package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooklogin {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("astha21yadav@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("pass")).sendKeys("astha21y");
		Thread.sleep(5000);
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(5000);
		driver.close();
		
		
}
}