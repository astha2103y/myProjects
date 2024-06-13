package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Facebook2 {

	
	public static void main(String[] args) throws InterruptedException {
	
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("abcd");
		Thread.sleep(5000);
		driver.findElement(By.name("lastname")).sendKeys("adgv");
		Thread.sleep(5000);
		By email = RelativeLocator.with(By.tagName("input")).below(By.name("lastname"));
		driver.findElement(email).sendKeys("Abc.com");
		Thread.sleep(2000);
		By Pass = RelativeLocator.with(By.tagName("input")).above(By.id("day"));
		driver.findElement(Pass).sendKeys("Astha@123");
		Thread.sleep(2000);
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("7");
		Thread.sleep(2000);
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Jun");
		Thread.sleep(2000);
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1999");
		Thread.sleep(2000);
		driver.findElement(By.name("sex")).click();
		Thread.sleep(2000);
		By malerb = RelativeLocator.with(By.tagName("input")).toRightOf(By.name("sex"));
		driver.findElement(malerb).click();
		Thread.sleep(2000);
		By customrb = RelativeLocator.with(By.tagName("input")).below(By.name("birthday_year"));
		driver.findElement(customrb).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);
		driver.close();

	
	}

}