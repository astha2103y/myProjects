package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Test_Chrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev");
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String pageTitle=driver.getTitle();
		System.out.println("pageTitle");
		Thread.sleep(5000);
		String pageURL=driver.getCurrentUrl();
		System.out.println("pageURL");
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
