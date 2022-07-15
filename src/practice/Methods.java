package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println("title of the url:"+title);
		String currenturl = driver.getCurrentUrl();
		System.out.println("print the current url:"+currenturl);
		String pagesource = driver.getPageSource();
		System.out.println("print current page source:"+pagesource);
		
		driver.close();
	}
}
