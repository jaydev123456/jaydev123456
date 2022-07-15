import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement searchbox= driver.findElement(By.xpath("//input[@type='text']"));
		searchbox.sendKeys("meesho");
		searchbox.sendKeys(Keys.ENTER);
		driver.close();
		 
	}

}
