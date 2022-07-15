package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotFlipkart {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(".//jaydev.png"));
		driver.close();

	}

}
