package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MuloperonSameElement {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webDriver.chrome.driver", "C://chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(5000);
    driver.findElement(By.linkText("Create new account")).click();
    Thread.sleep(5000);
    driver.findElement(By.name("firstname")).sendKeys("ASTHA");
    Thread.sleep(5000);
    WebElement fntextbox =  driver.findElement(By.name("lastname"));
    Thread.sleep(5000);
    fntextbox.sendKeys("yadav");
    Thread.sleep(5000);
    fntextbox.clear();
    Thread.sleep(5000);
    fntextbox.sendKeys("yad");
    Thread.sleep(5000);
    String fname = fntextbox.getAttribute("value");
    System.out.println(fname);
    Thread.sleep(5000);
    
    driver.close();
    

	}

}
