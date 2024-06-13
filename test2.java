package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C://msedgedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://form.jotform.com/233611152830042");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
