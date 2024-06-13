package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Tab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C://msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.TAB);
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.com");
	Thread.sleep(2000);
	driver.close();
	
	}

}
