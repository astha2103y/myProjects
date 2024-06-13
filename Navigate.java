package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C://msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.selenium.dev");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
		

	}

}
