package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lunchbrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String title= driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		driver.close();
		
		
	}

	}

