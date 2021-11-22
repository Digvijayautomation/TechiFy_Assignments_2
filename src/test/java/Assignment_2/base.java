package Assignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	public static WebDriver driver;

	
	public static WebDriver browser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cop = new ChromeOptions();
		cop.addArguments("--disable-notifications");
		driver= new ChromeDriver(cop);
		driver.manage().window().maximize();
		return driver;
	}

	
	
}
