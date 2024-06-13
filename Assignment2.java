package package1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String title= driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		driver.switchTo().frame("login_page");
		driver.findElement(By.partialLinkText("Know M")).click();
		Thread.sleep(5000);
		
		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(5000);
		driver.switchTo().window(list.get(1));
		Thread.sleep(5000);
		String title1= driver.getTitle();
		System.out.println(title1);
		Thread.sleep(5000);
		driver.switchTo().window(list.get(0));
		Thread.sleep(5000);
		String title11= driver.getTitle();
		System.out.println(title11);
		Thread.sleep(5000);
		driver.quit();
		
		
	}

	}

