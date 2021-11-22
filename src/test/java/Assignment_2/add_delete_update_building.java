package Assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class add_delete_update_building extends base {
	
	@Test(priority=1)
	public void launchweb() {
		driver = browser();
		driver.get("https://staging.aapkedoorstep.com/login");
	}
	@Test(priority=2)
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin@doorstep.com");
		driver.findElement(By.name("password")).sendKeys("doorstep@123");
		driver.findElement(By.id("loginClick")).click();
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void add_building() throws InterruptedException
	{
		//  DesiredCapabilities caps= new DesiredCapabilities();

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[4]/div/img")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add New Building']")).click();
		driver.findElement(By.cssSelector("#input-building-name")).sendKeys("sai apartment");
		driver.findElement(By.id("textareabuildings")).sendKeys("pashan, pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"CustomTypeahead\"]/div/div/div/input[1]")).sendKeys("maha",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div/input[1]")).sendKeys("pune",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.id("input-area")).sendKeys("pune");
		Thread.sleep(2000);
		driver.findElement(By.id("input-pincode")).sendKeys("411002");
		Thread.sleep(2000);
		driver.findElement(By.id("radio-label-radio-resident")).click();
		driver.findElement(By.id("radio-label-radio-flat")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div[4]/div/div/div/div/div/div/input[1]")).sendKeys("max",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		//caps.setAcceptInsecureCerts(true);
		// driver.findElement(By.linkText("OK")).click();
		driver.findElement(By.cssSelector("div.swal-button-container")).click();
		Thread.sleep(2000);
	}

	@Test(priority=4)
	public void update_building() throws InterruptedException
	{
		driver.findElement(By.id("search-bar")).sendKeys("sai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[3]/table/tbody/td[8]/span/img[1]")).click();
		WebElement pin = driver.findElement(By.id("input-pincode"));

		pin.clear();
		pin.sendKeys("411005");
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div[5]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.swal-button-container")).click();

		// if(driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[3]/table/thead/tr/th[1]")).getAttribute("sai") != null)
		//{
		//  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[3]/table/tbody/td[8]/span/img[1]")).click();
		//}
	}
	@Test(priority=5)
	public void delete_building() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[3]/table/tbody/td[8]/span/img[2]")).click();  
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.swal-button-container")).click();
	}
	/*
  @AfterTest
  public void closebrowser()
  {
	  driver.quit();
  }
	 */
}
