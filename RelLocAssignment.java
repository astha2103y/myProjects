package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelLocAssignment {

	
	

	public static void main(String[] args) throws InterruptedException {
		// Relative locators
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//toleftof
		By fname = RelativeLocator.with(By.tagName("input")).toLeftOf(By.name("lastname"));
		driver.findElement(fname).sendKeys("Astha");
		Thread.sleep(5000);
		//torightof
		By lname = RelativeLocator.with(By.tagName("input")).toRightOf(By.name("firstname"));
		driver.findElement(lname).sendKeys("yadav");
		Thread.sleep(5000);
		
		driver.close();
	}

}
