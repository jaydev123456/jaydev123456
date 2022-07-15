package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("jaydev.mistry1990@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("gmail.com");
		driver.findElement(By.xpath("//*[@class='_97w5']")).click();
		driver.findElement(By.name("firstname")).sendKeys("bulu");
		driver.findElement(By.name("lastname")).sendKeys("mistry");
		driver.findElement(By.name("reg_email__")).sendKeys("jaydevmistry2@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jaydevmistry2@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Lalita@123");
		driver.findElement(By.id("day")).sendKeys("6");
		driver.findElement(By.id("month")).sendKeys("Mar");
		driver.findElement(By.id("year")).sendKeys("1990");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//*[@name='websubmit']")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
