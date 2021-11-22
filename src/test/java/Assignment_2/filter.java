package Assignment_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class filter extends add_delete_update_building
{
  @Test(priority=6)
  public void Filter_by_state() throws InterruptedException {
	driver.findElement(RelativeLocator.with(By.cssSelector("img")).toRightOf(By.id("search-bar"))).click();  
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"CustomTypeahead\"]/div/div/div/input[1]")).sendKeys("maha",Keys.TAB);
	 Thread.sleep(2000);
	// driver.findElement(By.xpath("//p[normalize-space()='Service User Name']")).sendKeys("max",Keys.TAB);
	// driver.findElement(By.xpath("//input[@id='input-area']")).sendKeys(null) 
	 driver.findElement(By.xpath("//input[@id='radio-resident']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("radio-bunglow")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("radio-active")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
	 Thread.sleep(2000);
	
	 
  }

@Test(priority=7)
public void Filter_by_city() throws InterruptedException
{
	driver.findElement(RelativeLocator.with(By.cssSelector("img")).toRightOf(By.id("search-bar"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
	Thread.sleep(2000);
	driver.findElement(RelativeLocator.with(By.cssSelector("img")).toRightOf(By.id("search-bar"))).click(); 
	Thread.sleep(2000);
	driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"CustomTypeahead\"]/div/div/div/input[1]")).above(By.id("input-area"))).sendKeys("pune",Keys.ENTER);
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[class='rbt-input-main form-control rbt-input typeahead-input']")).sendKeys("pune",Keys.ENTER);
	 driver.findElement(By.id("radio-label-radio-commercial")).click();
	 Thread.sleep(2000);
	// driver.findElement(By.id("radio-bunglow")).click();
	 //Thread.sleep(2000);
	 driver.findElement(By.id("radio-active")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
	
}

}

