package Assignment_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class search_sale_person extends filter {
  @Test(priority=8)
  public void search_sale_person1() throws Exception
  {
	  driver.findElement(By.id("menu5")).click();
	  int searchbar = 0;
	if(searchbar==0)
	  {
		  driver.findElement(By.id("search-bar")).sendKeys("max");
		  Thread.sleep(2000);
		  List <WebElement> result = driver.findElements(By.xpath("//*[@id=\"salesperson-records\"]"));
		  
		  if(result.size() !=0)
		  {
			  System.out.println("Record is available");
		  }
		  else if(result.size() ==0) {
			  System.out.println("Record is  not available");
		}
		  
	  }
  }
}
