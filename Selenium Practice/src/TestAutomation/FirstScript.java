package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://onlinegrocery.levelzcomputing.com/index.php?route=account/register");
System.out.println("page url is " + " " +driver.getCurrentUrl());
Thread.sleep(5000);
driver.manage().window().maximize();

System.out.println("page title is " + " " +driver.getTitle());
Thread.sleep(5000);
driver.close();
	}

}
