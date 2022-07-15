package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//*[@class='demo-icon icon-flights']")).click();
		driver.findElement(By.xpath("//*[@title='One Way']")).click();
		driver.findElement(By.id("BE_flight_origin_city")).click();
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).click();
		driver.findElement(By.xpath("//*[@id='11/07/2022']")).click();
	}
}
