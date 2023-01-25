package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.getPageSource();
		driver.getPageSource().length();
		System.out.println("page length source is " + " " +driver.getPageSource().length());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		String chkurl = driver.getCurrentUrl();
		
		if (chkurl.equals(driver.getCurrentUrl())) {
			System.out.println("chk url is pass");
		}
			else
			{
				System.out.println("chk url fail");
			}
		 
		System.out.println("page title is " + " " + driver.getTitle());
		System.out.println("page length is " + " " + driver.getTitle().length());
		
		int pagelength = driver.getTitle().length();
		if (pagelength==driver.getTitle().length()) {
			System.out.println("pass");
		}
			else
			{
				System.out.println("fail");
			}
		}
		//driver.close();
	
}
